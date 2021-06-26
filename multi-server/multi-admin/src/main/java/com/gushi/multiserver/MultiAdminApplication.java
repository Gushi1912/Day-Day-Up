package com.gushi.multiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.gushi.multiserver")
public class MultiAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiAdminApplication.class, args);
	}

}
