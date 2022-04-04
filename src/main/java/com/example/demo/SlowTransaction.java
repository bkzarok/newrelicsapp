package com.example.demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.*;


@RestController
public class SlowTransaction {

	@GetMapping("/getdata")
	public String[] getData()
	{
		List<String> list = new ArrayList<String>();
		Random rand = new Random();		
		String[] words = {"Kuir Arok", "Spring Boot", "New Relic", "Perfomance Monitoring", "Java"};
		
		return words;
	}
	
	

}
