package com.jdbc.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jdbc.demo.dao.Dao;

@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	@Autowired
	private Dao empdao;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("{}",empdao.getEmployeeData());
		logger.info("{}",empdao.insertData());
	}
}
