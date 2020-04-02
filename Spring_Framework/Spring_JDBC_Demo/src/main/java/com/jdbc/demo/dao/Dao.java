package com.jdbc.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jdbc.demo.bean.Employee;

@Repository
public class Dao {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	
	public List<Employee> getEmployeeData() {
		
		List<Employee> emp = jdbctemplate.query("select * from Employee2", new BeanPropertyRowMapper<Employee>(Employee.class));
		return emp;
	}
	
	public int insertData() {
		
		return jdbctemplate.update("insert into Employee2 values(4,'ashwin','rnd',5000)");
		
	}
}
