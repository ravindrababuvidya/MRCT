package com.mrct;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/home")
public class AlienResources {
	AlientRepository repository = new AlientRepository();
	@Path("/users")
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public List<Alien> getAlliAliens(){
		return repository.getAllAliens();
	}
	
	@Path("/user/{id}")
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Alien getAlienById(@PathParam("id") int id){
		return repository.getAlien(id);
	}
	
	@Path("/alien")
	@POST
	public String createAlien(Alien alien) {
		return repository.createAlien(alien);
	}
}
