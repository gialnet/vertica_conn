package com.gialnet.vertica_conn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VerticaConnApplication {

    @Bean
	public CommandLineRunner ListTuplas(RepositorioPru repositorioPru) {

		return arg->repositorioPru.ListTuplas().forEach(System.err::println);
	}

	public static void main(String[] args) {
		SpringApplication.run(VerticaConnApplication.class, args);
	}
}
