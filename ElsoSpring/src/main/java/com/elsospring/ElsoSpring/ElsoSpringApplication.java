package com.elsospring.ElsoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import sun.dc.path.PathError;

import java.util.Arrays;

//@ComponentScan({"com.elsospring.ElsoSpring", "com.spy"})
@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class ElsoSpringApplication {

	// A Bean annotation hatására be fog kerülni a bean listába és látni fogja ez általt a container, még akkor is ha közvetlenül a Person osztály nem bean
	@Bean
	public Person giveMeANewPerson() {
		return new Person("Gyula", 20);
	}

	public static void main(String[] args) {
		ApplicationContext ct = SpringApplication.run(ElsoSpringApplication.class, args);
		String[] beanArray = ct.getBeanDefinitionNames();
		Arrays.sort(beanArray);

		for (String name : beanArray) {
			System.out.println(name);
		}
	}

}
