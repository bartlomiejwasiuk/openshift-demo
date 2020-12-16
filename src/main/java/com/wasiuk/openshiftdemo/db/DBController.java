package com.wasiuk.openshiftdemo.db;

import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {

	@Autowired
	DBService dbService;
	
	@GetMapping("/createDB")
	private String createDB() {
		Connection connection = dbService.connect();

		dbService.close(connection);
		return "done";
	}
	
	@GetMapping("/createDB")
	private String showDBContent() {
		
		return null;
	}
}
