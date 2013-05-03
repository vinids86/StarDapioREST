package com.example.stardapio.bean;

import javax.xml.bind.annotation.XmlRootElement;

//Um item do cardapio
@XmlRootElement
public abstract class Item {
	private String restaurante;
	private int id;
	private String nome;
	private String preco;
	private String descricao;
	private int picRes;

	public Item() {
	}

	@Override
	public String toString() {
		return nome;
	}

	public int getPicRes() {
		return picRes;
	}

	public void setPicRes(int picRes) {
		this.picRes = picRes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(String restaurante) {
		this.restaurante = restaurante;
	}
}