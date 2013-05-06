package com.example.stardapio.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Restaurant {
	private int id;
	private String nome;
	private String end;
	private int picRes;
	private Menu menu;

	public Restaurant() {

	}

	// Inicialmente sera usado para identificar o restaurante nas chamadas ao WS
	@Override
	public String toString() {
		return nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public int getPicRes() {
		return picRes;
	}

	public void setPicRes(int picRes) {
		this.picRes = picRes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

}
