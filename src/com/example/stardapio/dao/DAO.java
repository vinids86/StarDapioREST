package com.example.stardapio.dao;

import java.sql.Connection;
import java.util.ArrayList;

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
		return null;
	}
	
	public String inserirRestaurante(Restaurant restaurant) {
		return null;
	}
	
	public Restaurant buscarRestaurante(int id) {
		return null;
	}
	
	public String deleteRestaurante(int id) {
		return null;
	}
}
