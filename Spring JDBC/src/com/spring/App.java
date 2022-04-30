package com.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class App {
	public static void main(String[] args) {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("2020");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "insert into student (ID, Sname, age) values (?, ?, ?)";
		int result = jdbcTemplate.update(sql, 1, "Manish", 23);

		if (result > 0) {
			System.out.println("Students Table updated with " + result + " records");
		}
	}
}
