package com.cswp.webstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstprojApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=  SpringApplication.run(FirstprojApplication.class, args);
		
		 
		
		// But it can be avoided by using protype scope.
		// where object will create when below code is be called
		// When we use prototype so object is going to be created two times
//		Alien a = context.getBean(Alien.class);
//		a.show();
//		
//		Alien b = context.getBean(Alien.class);
//		b.show();
		
		// We are calling two times but object will create only one time.
		// Spring boot framework Bydefault uses singleton design pattern to create object of class
		
		Alien a = context.getBean(Alien.class);
		a.show();
	}

}
