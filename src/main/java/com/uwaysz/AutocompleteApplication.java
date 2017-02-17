package com.uwaysz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
@EnableAsync
@EntityScan(basePackages = {
		  "com.uwaysz.model"
		  })
@EnableJpaRepositories(basePackages = {
		  "com.uwaysz.repository"
		  })
public class AutocompleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutocompleteApplication.class, args);
	}
	
	@RequestMapping("/")
	String home() {
	    return "/index.html";
	}
}
