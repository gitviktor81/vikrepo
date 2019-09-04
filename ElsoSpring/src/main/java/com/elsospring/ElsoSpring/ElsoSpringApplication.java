package com.elsospring.ElsoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import sun.dc.path.PathError;

import java.util.Arrays;

// Megkeresi a pacakge-ben levo Bean-eket
//@ComponentScan({"com.elsospring.ElsoSpring", "com.spy"})

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
// Ahhoz kell, hogy az application.properties képes legyen Bean bol olvasni osztalyvaltozokat
@EnableAutoConfiguration
public class ElsoSpringApplication {

	// A Bean annotation hatására is be tud kerülni (nem csak @Component által) a bean listába és látni fogja ez általt a container, még akkor is ha közvetlenül a Person osztály nem bean
//	@Bean
//	public Person giveMeANewPerson() {
//		return new Person("Gyula", 20);
//	}

//	@Bean(name="gyula")
//	@Profile("dev")
//	public Person giveMeADevPerson() {
//		return new Person("dev");
//	}
//	@Bean(name="gyula")
//	@Profile("prod")
//	public Person giveMeAProdPerson() {
//		return new Person("prod");
//	}

	public static void main(String[] args) {
		ApplicationContext ct = SpringApplication.run(ElsoSpringApplication.class, args);
//		String[] beanArray = ct.getBeanDefinitionNames();
//		Arrays.sort(beanArray);
//
//		for (String name : beanArray) {
//			System.out.println(name);
//		}
//		System.out.println(ct.getBean("gyula"));
//		System.out.println(ct.getBean("person"));

	}

}
