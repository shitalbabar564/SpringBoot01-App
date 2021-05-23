package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot01AppApplication {

  private map <String,Object> cache= new HashMap<String,Object>();
 	private static final String REST_URL="http://www.equifax.com/getscores"; 
	public static void main(String[] args) {
		ConfigurableApplicationContext run= SpringApplication.run(SpringBoot01AppApplication.class, args);
		//changes for HIS-134
int a=10;
//HIS-301 changes
public void loadDatatoCache(){
	//some logic here
}
  }

}
