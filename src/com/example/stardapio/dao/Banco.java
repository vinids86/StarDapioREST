package com.example.stardapio.dao;

import java.util.ArrayList;

import com.example.stardapio.bean.Item;
import com.example.stardapio.bean.Menu;
import com.example.stardapio.bean.Restaurant;
import com.example.stardapio.bean.Sobremesa;

public class Banco {
	private static Banco instance;
	private ArrayList<Restaurant> listaRestaurantes;
	private ArrayList<Item> listaItens;
	private Menu menu;
	private int idRestaurante;
	private int idItem;

	private Banco() {
		idRestaurante = 1;
		listaRestaurantes = new ArrayList<Restaurant>();
		Restaurant restaurant = new Restaurant();
		restaurant.setNome("CaradeFome");
		restaurant.setEnd("La longe..");
		restaurant.setPicRes(0);
		inserirRestaurante(restaurant);

		idItem = 1;
		listaItens = new ArrayList<Item>();
		Item item = new Sobremesa();
		item.setNome("Construtor");
		item.setDescricao("Desc Construtor");
		item.setPreco("R$ Contrutor");
		
		menu = new Menu();
		menu.addItem("Cara de Fome", item);
	}

	public static Banco getBancoInstance() {
		if (instance == null)
			instance = new Banco();
		return instance;
	}

	public ArrayList<Restaurant> getListaRestaurantes() {
		return listaRestaurantes;
	}

	public ArrayList<Item> getListaItens() {
		return listaItens;
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

	public String inserirItem(Item item) {
		item.setId(idItem++);
		listaItens.add(item);
		return "Item inserido no banco com sucesso!";
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
			return "Restaurante não encontrado!";
		} else {
			listaRestaurantes.remove(pos);
			return "Restaurante removido com sucesso!";
		}
	}

	public Menu getMenu(String restaurante, Item tipoItem) {
		
		return menu;
	}
}
