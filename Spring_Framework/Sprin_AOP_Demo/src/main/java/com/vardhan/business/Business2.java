package com.vardhan.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vardhan.dao.Dao;
import com.vardhan.dao.Dao2;

@Service
public class Business2 {

	@Autowired
	private Dao2 dao2;
	
	public String getBusinessDetails() {
		
		 return dao2.getInfo();
	
	}
}
