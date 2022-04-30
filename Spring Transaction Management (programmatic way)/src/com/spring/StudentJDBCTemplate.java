package com.spring;

import java.util.List;
import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentJDBCTemplate implements StudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private PlatformTransactionManager transactionManager;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	@Override
	public void create(String name, Integer age, Integer marks, Integer year) {
		TransactionDefinition def = new DefaultTransactionDefinition();
		TransactionStatus status = transactionManager.getTransaction(def);

		try {
			String SQL1 = "insert into Student (name, age) values (?, ?)";
			jdbcTemplate.update(SQL1, name, age);

			// Get the latest student id to be used in Marks table
			String SQL2 = "select max(id) from Student";
			int sid = jdbcTemplate.queryForObject(SQL2, Integer.class	);

			String SQL3 = "insert into Marks(sid, marks, year) " + "values (?, ?, ?)";
			jdbcTemplate.update(SQL3, sid, marks, year);

			System.out.println("Created Name = " + name + ", Age = " + age);
			transactionManager.commit(status);
			

		} catch (DataAccessException e) {
			System.out.println("Error in creating record, rolling back");
			transactionManager.rollback(status);
			throw e;
		}
		return;
	}

	@Override
	public List<StudentMarks> list() {
		String SQL = "select * from Student, Marks where Student.id=Marks.sid";
		List<StudentMarks> studentMarks = jdbcTemplate.query(SQL, new StudentMarksMapper());
		return studentMarks;

	}

	@Override
	public void delete(Integer id) {
		String SQL4 = "delete from student where id = ?";
		String SQL5 = "delete from marks where sid = ?";
		jdbcTemplate.update(SQL4, id);
		jdbcTemplate.update(SQL5, id);
		System.out.println("Deleted Record with ID = " + id);
		
	}
}
