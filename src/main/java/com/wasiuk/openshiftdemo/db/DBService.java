package com.wasiuk.openshiftdemo.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class DBService {
	private static final String DB_URL = System.getenv("DB_URL");
	private static final String DB_USER = System.getenv("DB_USER");
	private static final String DB_PASS = System.getenv("DB_PASS");

	public Connection connect() {
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return connection;
	}
	
	public void close(Connection connection) {	
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
