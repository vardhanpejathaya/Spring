package com.vardhan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vardhan.business.Business1;
import com.vardhan.business.Business2;
import com.vardhan.business.Business3;

@SpringBootApplication
public class SprinAopDemoApplication implements CommandLineRunner {

	@Autowired
	private Business1 business1;
	
	@Autowired
	private Business2 business2;
	
	@Autowired
	private Business3 business3;
	
	public static void main(String[] args) {
		SpringApplication.run(SprinAopDemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		business1.getBusinessDetails();
		business2.getBusinessDetails();
		business3.getBusinessDetails();
	}

}
