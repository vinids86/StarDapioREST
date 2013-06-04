package com.example.stardapio.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Restaurant {
	private int id;
	private String nome;
	private String end;
	private String urlImage;
	private Menu menu;
	private double lat;
	private double lng;

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

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
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

	public double getLat() {
		// TODO Auto-generated method stub
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}
}
