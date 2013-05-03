package com.example.stardapio.resources;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.example.stardapio.dao.Banco;
import com.example.stardapio.bean.Restaurant;
import com.example.stardapio.exception.NoContentException;
import com.google.gson.Gson;

@Path("/restaurante")
public class RestaurantResource {

	@GET
	@Path("/buscarTodos")
	@Produces("application/json")
	public ArrayList<Restaurant> selTodos() {
		return Banco.getBancoInstance().getListaRestaurantes();
	}

	@GET
	@Path("/buscarTodosGSON")
	@Produces("application/json")
	public String selTodosGSON() {
		return new Gson().toJson(Banco.getBancoInstance()
				.getListaRestaurantes());
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Restaurant getRestaurant(@PathParam("id") int id) {
		Restaurant restaurante = Banco.getBancoInstance().buscarRestaurante(id);

		if (restaurante == null)
			throw new NoContentException("Restaurante nao econtrado");

		return restaurante;
	}

	@GET
	@Path("/delete/{id}")
	@Produces("application/json")
	public String deleteRestaurant(@PathParam("id") int id) {
		return Banco.getBancoInstance().deleteRestaurante(id);
	}

	@POST
	@Path("/inserir")
	@Produces("application/json")
	@Consumes("application/json")
	public String inserirRestaurante(Restaurant restaurante) {
		return Banco.getBancoInstance().inserirRestaurante(restaurante);
	}
}
