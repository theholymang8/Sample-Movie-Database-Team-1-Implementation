package com.pfseven.smdb.smdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.pfseven.smdb.smdb.repositories",
		repositoryImplementationPostfix = "CustomImpl",
		namedQueriesLocation = "classpath:jpa-named-queries.properties")
public class SmdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmdbApplication.class, args);
	}

}
