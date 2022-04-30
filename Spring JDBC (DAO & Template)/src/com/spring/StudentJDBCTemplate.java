package com.spring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbctemplate;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbctemplate = new JdbcTemplate(dataSource);

	}

	@Override
	public void create(String name, Integer age) {
		String sql = "insert into Student (name, age) values (?, ?)";
		jdbctemplate.update(sql, name, age);
		System.out.println("Created Record Name = " + name + " Age = " + age);

	}

	@Override
	public void delete(Integer id) {
		String SQL = "delete from Student where id = ?";
		jdbctemplate.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);

	}

	@SuppressWarnings("deprecation")
	@Override
	public Student get(Integer id) {
		String SQL = "select * from Student where id = ?";
		Student student = jdbctemplate.queryForObject(SQL, new Object[] { id }, new StudentMapper());
		return student;

	}

	@Override
	public void update(Integer id, Integer age) {
		String SQL = "update Student set age = ? where id = ?";
		jdbctemplate.update(SQL, age, id);
		System.out.println("Updated Record with ID = " + id);

	}

	@Override
	public List<Student> list() {
		String SQL = "select * from Student";
		List<Student> students = jdbctemplate.query(SQL, new StudentMapper());
		return students;
	}

}
