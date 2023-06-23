package com.priya.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringbootDemoApplication.class, args);
		//System.out.println("Hello Spring");
		
		Alien a1 = context.getBean(Alien.class);
		a1.show();
//		
//		Alien a2 = context.getBean(Alien.class);
//		a2.show();
	}

}

//by default when ConfigurableApplicationContext called it will create a object of alien.
//it will create the objct only once.

//When we use prototype, it will create the objects as many we call getBeans. if we dont call getBeans it do not create the object of ALien.
