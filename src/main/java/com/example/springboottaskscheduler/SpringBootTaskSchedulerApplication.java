package com.example.springboottaskscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootTaskSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTaskSchedulerApplication.class, args);
	}

}
