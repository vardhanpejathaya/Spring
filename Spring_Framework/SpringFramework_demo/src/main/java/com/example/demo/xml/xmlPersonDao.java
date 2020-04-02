package com.example.demo.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.scope.JdbcConnection;


public class xmlPersonDao {


	xmlJdbcConnection xmljdbcconnection;

	public xmlJdbcConnection getXmljdbcconnection() {
		return xmljdbcconnection;
	}

	public void setXmljdbcconnection(xmlJdbcConnection xmljdbcconnection) {
		this.xmljdbcconnection = xmljdbcconnection;
	}

	
}
