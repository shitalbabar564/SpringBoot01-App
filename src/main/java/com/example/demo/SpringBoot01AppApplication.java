package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot01AppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run= SpringApplication.run(SpringBoot01AppApplication.class, args);
		//changes for HIS-134
i		nt a=10;
			//HIS-200 related
		public void doProcess(){
			//some logic here
		}
		run.close();
	}

}
