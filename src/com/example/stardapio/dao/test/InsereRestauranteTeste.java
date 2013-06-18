package com.example.stardapio.dao.test;

import com.example.stardapio.bean.Restaurant;
import com.example.stardapio.dao.DAO;

public class InsereRestauranteTeste {
	public static void main(String[] args) {
		Restaurant restaurante = new Restaurant();
		restaurante.setName("Cara de Fome");
		restaurante.setAddress("Av. Paulista, 647");
		restaurante.setLat(43.7894561);
		restaurante.setLng(-43.45612);
		
		DAO dao = new DAO();
		dao.inserirRestaurante(restaurante);
		
		System.out.println("Gravado!!");
	}
}
