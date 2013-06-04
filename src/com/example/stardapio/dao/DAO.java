package com.example.stardapio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.stardapio.bean.Restaurant;
import com.example.stardapio.jdbc.ConnectionFactory;

public class DAO {
	private Connection connection;
	
	public DAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public Restaurant getMenu(int idRestaurante) {
		
		return null;
	}
	
	public Restaurant getMenu(String nomeRestaurante) {
		return null;
	}
	
	public ArrayList<Restaurant> getListaRestaurantes() {
		String sql = "select * from restaurant";
		try {
			List<Restaurant> restaurantes = new ArrayList<Restaurant>();
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Restaurant restaurante = new Restaurant();
				restaurante.setId(rs.getInt("id"));
				restaurante.setNome(rs.getString("name"));
				restaurante.setEnd(rs.getString("address"));
				
				restaurantes.add(restaurante);
			}
			rs.close();
			stmt.close();
			
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}
	
	public String inserirRestaurante(Restaurant restaurant) {
		String sql = "insert into restaurant " +
				"(name, address, lat, lng)" +
				"values (?, ?, ?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, restaurant.getNome());
			stmt.setString(2, restaurant.getEnd());
			stmt.setDouble(3, restaurant.getLat());
			stmt.setDouble(4, restaurant.getLng());
			
			stmt.execute();
			stmt.close();
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
		return "Restaurante inserido no banco com sucesso!";
	}
	
	public Restaurant buscarRestaurante(int id) {
		return null;
	}
	
	public String deleteRestaurante(int id) {
		return null;
	}
}
