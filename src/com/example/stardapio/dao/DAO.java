package com.example.stardapio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.stardapio.bean.Item;
import com.example.stardapio.bean.Restaurant;
import com.example.stardapio.jdbc.ConnectionFactory;

public class DAO {
	private Connection connection;

	public DAO() {
		this.connection = new ConnectionFactory().getConnection();
	}



	public List<Item> getMenu(int idRestaurante) {
		String sql = "select * from item " +
				"where id_restaurant = " + idRestaurante;
		try {
			List<Item> itens = new ArrayList<Item>();
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Item item = new Item();
				item.setIdItem(rs.getInt("id"));
				item.setName(rs.getString("name"));
				item.setPrice(rs.getDouble("price"));
				item.setDescription(rs.getString("description"));
				item.setUrlImage(rs.getString("urlImage"));
				item.setIdRestaurante(rs.getInt("id_restaurant"));
				item.setIdType(rs.getInt("id_type"));
				
				itens.add(item);
			}
			rs.close();
			stmt.close();
			return itens;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Restaurant> getListaRestaurantes() {
		String sql = "select * from restaurant";
		try {
			List<Restaurant> restaurantes = new ArrayList<Restaurant>();
			PreparedStatement stmt = this.connection.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Restaurant restaurante = new Restaurant();
				restaurante.setIdRestaurant(rs.getInt("id_restaurant"));
				restaurante.setName(rs.getString("name"));
				restaurante.setAddress(rs.getString("address"));
				restaurante.setLat(rs.getDouble("lat"));
				restaurante.setLng(rs.getDouble("lng"));

				restaurantes.add(restaurante);
			}
			rs.close();
			stmt.close();
			return restaurantes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void inserirItem(Item item) {
		String sql = "insert int item"
				+ "(name, price, description, urlImage, id_restaurant, id_type)"
				+ "values (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, item.getName());
			stmt.setDouble(2, item.getPrice());
			stmt.setString(3, item.getDescription());
			stmt.setString(4, item.getUrlImage());
			stmt.setInt(5, item.getIdRestaurante());
			stmt.setInt(6, item.getIdType());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Restaurant buscarRestaurante(int id) {
		String sql = "select * from restaurant where id_restaurant = " + id;

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			Restaurant restaurante = new Restaurant();

			while (rs.next()) {
				restaurante.setIdRestaurant(rs.getInt("id_restaurant"));
				restaurante.setName(rs.getString("name"));
				restaurante.setAddress(rs.getString("address"));
			}
			rs.close();
			stmt.close();

			return restaurante;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void inserirRestaurante(Restaurant restaurant) {
		String sql = "insert into restaurant " + "(name, address, lat, lng)"
				+ "values (?, ?, ?, ?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, restaurant.getName());
			stmt.setString(2, restaurant.getAddress());
			stmt.setDouble(3, restaurant.getLat());
			stmt.setDouble(4, restaurant.getLng());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/*
	 * public void deleteRestaurante(int id) {
	 * 
	 * String sql = "delete from restaurant where id_restaurant = " + id; try {
	 * PreparedStatement stmt = connection.prepareStatement(sql);
	 * stmt.execute(); stmt.close(); } catch (SQLException e) { throw new
	 * RuntimeException(e); } }
	 */
}
