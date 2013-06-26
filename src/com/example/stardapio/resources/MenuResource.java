package com.example.stardapio.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.example.stardapio.dao.DAO;
import com.google.gson.Gson;

@Path("/menu")
public class MenuResource {

	@GET
	@Path("/GSON/{id}")
	@Produces("application/json")
	public String getMenuGSON(@PathParam("id") int idRestaurante) {
		return new Gson().toJson(new DAO().getMenu(idRestaurante));

	}

	@GET
	@Path("/types/{id}")
	@Produces("application/json")
	public String getType(@PathParam("id") int idRestaurante) {
		return new Gson().toJson(new DAO().getType(idRestaurante));
	}
	
	@GET
	@Path("/GSON/restaurant/{id_restaurant}/type/{id_type}")
	@Produces("application/json")
	public String getItemType(@PathParam("id_restaurant") int idRestaurante, @PathParam("id_type") int idType) {
		return new Gson().toJson(new DAO().getItemType(idRestaurante, idType));
	}
}
