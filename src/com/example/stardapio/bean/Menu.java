package com.example.stardapio.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Menu {
	private List<Item> itens;
	private Menu menu;
	List<Bebida> bebidas;
	List<Sobremesa> sobremesas;

	public Menu() {
		bebidas = new ArrayList<Bebida>();
		sobremesas = new ArrayList<Sobremesa>();
	}

	private List<Sobremesa> getSobremesas() {

		for (Item i : itens) {
			if (i instanceof Sobremesa)
				sobremesas.add((Sobremesa) i);
		}
		return sobremesas;
	}

	private List<Bebida> getBebidas() {

		for (Item i : itens) {
			if (i instanceof Sobremesa)
				bebidas.add((Bebida) i);
		}
		return bebidas;
	}

	public Menu getItens(Item item) {
		if (item instanceof Sobremesa)
			return new Menu().addItens(getSobremesas());
		if (item instanceof Bebida)
			return new Menu().addItens(getBebidas());

		return null;
	}

	public Menu addItem(String restaurante, Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	private Menu addItens(List<? extends Item> itens) {
		// TODO Auto-generated method stub
		return null;
	}

}
