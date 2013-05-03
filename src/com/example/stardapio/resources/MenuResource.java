package com.example.stardapio.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.example.stardapio.bean.Item;
import com.example.stardapio.bean.Menu;
import com.example.stardapio.dao.Banco;

@Path("/menu")
public class MenuResource {

	@GET
	@Path("/{restaurante}/{tipoItem}")
	@Produces("application/json")
	public Menu getMenu(@PathParam("restaurante") String restaurante,
			@PathParam("tipoItem") Item tipoItem) {
		Menu menu = Banco.getBancoInstance().getMenu(restaurante, tipoItem);
		return menu;
	}

}
