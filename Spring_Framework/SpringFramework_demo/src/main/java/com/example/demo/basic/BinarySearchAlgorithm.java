package com.example.demo.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchAlgorithm {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/*
	 * Autowiring types: by type by name Qualifier
	 */

	@Autowired
	@Qualifier("quk")
	private searchalgo search;

	public int search(int[] numbers, int searchItem) {

		int result = search.sort(numbers, searchItem);
		return result;

	}

	@PostConstruct
	public void postConstruct() {
		logger.info("POST construct");
	}
	
	@PreDestroy
	public void predestroy() {
		logger.info("PRE Destroy");
	}
	
	
}
