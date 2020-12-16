package com.wasiuk.openshiftdemo.db;

import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyDBController {

	@Autowired
	DBService dbService;
	
	@GetMapping("/createDB")
	private String createMyDB() {

		return "done";
	}
	
	@GetMapping("/showDB")
	private String showDBContent() {
		
		return null;
	}
}
