package com.mane.santosh.week1.WeekOneIntro;

import com.mane.santosh.week1.WeekOneIntro.alice_bakery.CakeBaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WeekOneIntroApplication implements CommandLineRunner {

	@Autowired
	CakeBaker cakeBaker;

	public static void main(String[] args) {
		SpringApplication.run(WeekOneIntroApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		cakeBaker.bakeCake();
	}
}
