package com.example.stardapio.dao;

import java.util.ArrayList;

import com.example.stardapio.bean.Bebida;
import com.example.stardapio.bean.Item;
import com.example.stardapio.bean.Menu;
import com.example.stardapio.bean.Restaurant;
import com.example.stardapio.bean.Sobremesa;

public class Banco {
	private static Banco instance;
	private ArrayList<Restaurant> listaRestaurantes;
	private Menu menu;
	private int idRestaurante;

	private Banco() {
		idRestaurante = 1;
		listaRestaurantes = new ArrayList<Restaurant>();
		Restaurant restaurant = new Restaurant();
		restaurant.setNome("Cara de Fome");
		restaurant.setEnd("La longe..");
		restaurant.setPicRes(0);
		inserirRestaurante(restaurant);

		Item item1 = new Bebida();
		item1.setNome("Construtor");
		item1.setDescricao("Desc Construtor");
		item1.setPreco("R$ Contrutor");
		
		Item item2 = new Sobremesa();
		item2.setNome("Item2");
		item2.setDescricao("Desc Item2");
		item2.setPreco("Preco Item2");

		menu = new Menu();
		menu.addItem(item1);
		menu.addItem(item2);
		
		restaurant.setMenu(menu);
	}

	public static Banco getBancoInstance() {
		if (instance == null)
			instance = new Banco();
		return instance;
	}

	public Restaurant getMenu(String nomeRestaurante) {
		Restaurant restaurante = null;
		for (int i = 0; i < listaRestaurantes.size(); i++) {
			if (listaRestaurantes.get(i).getNome().equals(nomeRestaurante)) {
				restaurante = new Restaurant();
				restaurante = listaRestaurantes.get(i);
				break;
			}
		}
		return restaurante;
	}

	public ArrayList<Restaurant> getListaRestaurantes() {
		return listaRestaurantes;
	}

	public String inserirRestaurante(Restaurant restaurant) {
		restaurant.setId(idRestaurante++);
		listaRestaurantes.add(restaurant);
		return "Restaurante inserido no banco com sucesso!";
	}

	public Restaurant buscarRestaurante(int id) {
		Restaurant restaurante = null;
		for (int i = 0; i < listaRestaurantes.size(); i++) {
			if (listaRestaurantes.get(i).getId() == id) {
				restaurante = new Restaurant();
				restaurante = listaRestaurantes.get(i);
				break;
			}
		}
		return restaurante;
	}

	private int getPositionRestaurante(int id) {
		int pos = -1;
		for (int i = 0; i < listaRestaurantes.size(); i++) {
			if (listaRestaurantes.get(i).getId() == id) {
				pos = i;
			}
		}
		return pos;
	}

	public String deleteRestaurante(int id) {
		Restaurant restaurante = buscarRestaurante(id);
		int pos = getPositionRestaurante(id);
		if (restaurante == null || pos < 0) {
			return "Restaurante nao encontrado!";
		} else {
			listaRestaurantes.remove(pos);
			return "Restaurante removido com sucesso!";
		}
	}
}
