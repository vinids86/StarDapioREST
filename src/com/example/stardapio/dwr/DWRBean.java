package com.example.stardapio.dwr;

public class DWRBean {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getData() {
		return System.currentTimeMillis() + "";
	}
}
