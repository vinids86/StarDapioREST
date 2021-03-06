package com.example.stardapio.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pedido {
	private List<Item> itens;
	private long idCliente;
	private long mesa;
	private long idRestaurant;
	
	public Pedido() {
		itens = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		itens.add(item);
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public long getMesa() {
		return mesa;
	}

	public void setMesa(long mesa) {
		this.mesa = mesa;
	}

	public long getIdRestaurant() {
		return idRestaurant;
	}

	public void setIdRestaurant(long idRestaurant) {
		this.idRestaurant = idRestaurant;
	}
}
