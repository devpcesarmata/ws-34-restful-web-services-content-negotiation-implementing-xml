package com.cesarmata.ws34restfulwebservicescontentnegotiationimplementingxml;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@SpringBootApplication
public class Ws34RestfulWebServicesContentNegotiationImplementingXmlApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ws34RestfulWebServicesContentNegotiationImplementingXmlApplication.class, args);
	}
	
	@Bean
	public LocaleResolver localResolver() {
		AcceptHeaderLocaleResolver localResolver = new AcceptHeaderLocaleResolver();
		localResolver.setDefaultLocale(Locale.US);
		return localResolver;
	}
}