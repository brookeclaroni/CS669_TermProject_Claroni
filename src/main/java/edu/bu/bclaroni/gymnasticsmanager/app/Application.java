package edu.bu.bclaroni.gymnasticsmanager.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"edu.bu.bclaroni.gymnasticsmanager.app.entity"})
@EnableJpaRepositories(basePackages = {"edu.bu.bclaroni.gymnasticsmanager.app.repository"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
