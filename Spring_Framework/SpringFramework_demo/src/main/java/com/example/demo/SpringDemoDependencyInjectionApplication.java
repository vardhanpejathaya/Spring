package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.basic.BinarySearchAlgorithm;

@SpringBootApplication
public class SpringDemoDependencyInjectionApplication {

	public static void main(String[] args) {
		
		//BinarySearchAlgorithm binarysearch = new BinarySearchAlgorithm(new Quicksort());
		//getting the bean from spring 
		ApplicationContext ctx =SpringApplication.run(SpringDemoDependencyInjectionApplication.class, args);
		BinarySearchAlgorithm binarysearch= ctx.getBean(BinarySearchAlgorithm.class);
		BinarySearchAlgorithm binarysearch1= ctx.getBean(BinarySearchAlgorithm.class);
		
		System.out.println("Bean Details------->");
		System.out.println(binarysearch);
		System.out.println(binarysearch1);
		
		int result =binarysearch.search(new int[] {1,2,3}, 6);
		System.out.println("Result--->"+result);
		
	}

}
