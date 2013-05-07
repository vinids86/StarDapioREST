package com.example.stardapio.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.example.stardapio.bean.Item;
import com.example.stardapio.bean.Restaurant;
import com.example.stardapio.dao.Banco;
import com.example.stardapio.exception.NoContentException;
import com.google.gson.Gson;

@Path("/menu")
public class MenuResource {

	@GET
	@Path("/{restaurante}")
	@Produces("application/json")
	public List<Item> getMenu(@PathParam("restaurante") String nomeRestaurante) {
		Restaurant restaurante = Banco.getBancoInstance().getMenu(
				nomeRestaurante);

		if (restaurante == null)
			throw new NoContentException("Restaurante nao econtrado");

		return restaurante.getMenu().getItens();
	}

	@GET
	@Path("/GSON/{id}")
	@Produces("application/json")
	public String getMenuGSON(@PathParam("id") int idRestaurante) {
		return new Gson().toJson(Banco.getBancoInstance()
				.getMenu(idRestaurante).getMenu().getItens());

	}

}
