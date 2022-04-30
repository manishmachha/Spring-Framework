package com.spring;

import java.util.List;
import javax.sql.DataSource;	
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer age, Integer marks, Integer year) {

		try {
			String SQL1 = "insert into Student (name, age) values (?, ?)";
			jdbcTemplate.update(SQL1, name, age);

			// Get the latest student id to be used in Marks table
			String SQL2 = "select max(id) from Student";
			int sid = jdbcTemplate.queryForObject(SQL2, Integer.class	);

			String SQL3 = "insert into Marks(sid, marks, year) " + "values (?, ?, ?)";
			jdbcTemplate.update(SQL3, sid, marks, year);

			System.out.println("Created Name = " + name + ", Age = " + age);
			
			throw new RuntimeException("simulate Error condition") ;

		} catch (RuntimeException e) {
			System.out.println("Error in creating record, rolling back");
			throw e;
		}
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
