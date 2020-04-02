package com.vardhan.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vardhan.aop.demoAnnotation;
import com.vardhan.dao.Dao3;

@Service
public class Business3 {

	
	@Autowired
	private Dao3 dao3;
	
	@demoAnnotation
	public String getBusinessDetails() {
		
		 return dao3.getInfo();
	
	}
}
