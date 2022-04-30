package com.spring;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {

	public void setDataSource(DataSource ds);

	public void create(String name, Integer age);

	public void delete(Integer id);

	public Student get(Integer id);

	public void update(Integer id, Integer age);

	public List<Student> list();
}
