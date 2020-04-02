package com.vardhan.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vardhan.dao.Dao;

@Service
public class Business1 {

	@Autowired
	private Dao dao1;
	
	public String getBusinessDetails() {
		
		return dao1.getInfo();
		 
	}
}
