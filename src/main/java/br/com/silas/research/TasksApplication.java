package br.com.silas.research;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.silas.research.resolver.Mutation;
import br.com.silas.research.resolver.Query;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}
	
	@Bean
	public Query query() {
		return new Query();
	}
	
	@Bean
	public Mutation mutation() {
		return new Mutation();
	}
}
