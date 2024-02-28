package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@SpringBootApplication
public class FiskalizacijaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiskalizacijaApplication.class, args);
	}


}
