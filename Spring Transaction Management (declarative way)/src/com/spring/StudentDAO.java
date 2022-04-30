package com.spring;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {

	public void setDataSource(DataSource dataSource);

	public void create(String name, Integer age, Integer marks, Integer year);

	public void delete(Integer id);

	public List<StudentMarks> list();
}
