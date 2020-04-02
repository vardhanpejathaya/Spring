package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.example.demo.scope.JdbcConnection;
import com.example.demo.scope.PersonDao;
import com.example.demo.xml.SomeExternalUrl;

//@SpringBootApplication
@Configuration
@ComponentScan("com.example.demo.scope")
@PropertySource("classpath:app.properties")
public class SpringScopeDemoApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeDemoApplication.class);

	public static void main(String[] args) {

		// ApplicationContext ctx =
		// SpringApplication.run(SpringScopeDemoApplication.class, args);
		// ApplicationContext ctx = new
		// AnnotationConfigApplicationContext(SpringScopeDemoApplication.class);
		// close resoure using try with resource
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				SpringScopeDemoApplication.class)) {

			PersonDao p1 = ctx.getBean(PersonDao.class);
			PersonDao p2 = ctx.getBean(PersonDao.class);

			System.out.println("Helloooo");
			LOGGER.info("{}", p1);
			LOGGER.info("{}", p1.getJdbcconnection());
			LOGGER.info("{}", p2);
			LOGGER.info("{}", p2.getJdbcconnection());

			// ctx.close();
		}
		
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				SomeExternalUrl.class)) {

			SomeExternalUrl someExurl = ctx.getBean(SomeExternalUrl.class);
			
			LOGGER.info("----->>>{}", someExurl.getUrl());

			// ctx.close();
		}
	}

}
