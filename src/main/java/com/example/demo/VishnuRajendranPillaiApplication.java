package com.example.demo;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VishnuRajendranPillaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(VishnuRajendranPillaiApplication.class, args);
		
		//Show Greeting
		Calendar c = Calendar.getInstance();
		int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

		if(timeOfDay >= 0 && timeOfDay < 12){
			System.out.println("Good Morning Vishnu Welcome to COMP367");       
		}else if(timeOfDay >= 12 && timeOfDay < 16){
			System.out.println("Good Afternoon Vishnu Welcome to COMP367");
		}else if(timeOfDay >= 16 && timeOfDay < 21){
			System.out.println("Good Evening Vishnu Welcome to COMP367");
		}else if(timeOfDay >= 21 && timeOfDay < 24){
			System.out.println("Good Night Vishnu Welcome to COMP367");
		}
	}
}
