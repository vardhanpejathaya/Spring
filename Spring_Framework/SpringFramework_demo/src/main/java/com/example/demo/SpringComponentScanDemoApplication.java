
package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.scope.JdbcConnection;
import com.example.demo.scope.PersonDao;

import componentscan.EmployeScan;

@SpringBootApplication

@ComponentScan("componentscan")
public class SpringComponentScanDemoApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanDemoApplication.class);

	public static void main(String[] args) {

		ApplicationContext bean = SpringApplication.run(SpringComponentScanDemoApplication.class, args);
		EmployeScan emp = bean.getBean(EmployeScan.class);
		System.out.println(emp.toString());

	}

}
