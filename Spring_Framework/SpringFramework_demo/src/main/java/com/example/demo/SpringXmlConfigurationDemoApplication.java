package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.scope.JdbcConnection;
import com.example.demo.scope.PersonDao;
import com.example.demo.xml.xmlPersonDao;

//@SpringBootApplication
//@Configuration
//@ComponentScan("com.example.demo.xml")
public class SpringXmlConfigurationDemoApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringXmlConfigurationDemoApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"xmlApplicationContext.xml")) {

			xmlPersonDao p1 = ctx.getBean(xmlPersonDao.class);
			xmlPersonDao p2 = ctx.getBean(xmlPersonDao.class);

			System.out.println("Helloooo");
			LOGGER.info("{}", p1);
			LOGGER.info("{}", p1.getXmljdbcconnection());
			LOGGER.info("{}", p2);
			LOGGER.info("{}", p2.getXmljdbcconnection());
			
			
			LOGGER.info("Beans --> {}",(Object)ctx.getBeanDefinitionNames());

		
		}
	}

}
