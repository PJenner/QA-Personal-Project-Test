package com.bae.testpersonalproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.bae.testpersonalproject.domain.Starship;
import com.bae.testpersonalproject.rest.StarshipController;

@SpringBootApplication
public class QaPersonalProjectTestApplication {

	@Bean
	public List<Starship> makeListBean() {
		List<Starship> starships = new ArrayList<>();
		starships.add(new Starship("Enterprise", "D", 5));
		return starships;
	}

	public static void main(String[] args) {
		ApplicationContext beanBag = SpringApplication.run(QaPersonalProjectTestApplication.class, args);

		StarshipController PC = beanBag.getBean(StarshipController.class);
		System.out.println(PC);
	}

}
