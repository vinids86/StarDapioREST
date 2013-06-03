package com.example.stardapio.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver()); //Essa linha foi a diferença
			return DriverManager.getConnection(
					"jdbc:mysql://localhost/stardapio", "root", "123456");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
