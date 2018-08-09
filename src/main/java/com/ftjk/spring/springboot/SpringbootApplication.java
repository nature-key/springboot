package com.ftjk.spring.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication  springApplication = new SpringApplication(SpringbootApplication.class);
//		springApplication.setAdditionalProfiles("test");
		ConfigurableApplicationContext  context = springApplication.run(args);
		System.out.println(context.getEnvironment().getProperty("spring.name"));
		System.out.println(context.getEnvironment().getProperty("jdbc.url"));
		System.out.println(context.getBean(BookBean.class));
	}
}
