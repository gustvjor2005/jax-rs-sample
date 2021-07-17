package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entity.Author;


@Path("/book")
public class Book {

	@GET
	@Produces(MediaType.APPLICATION_JSON) 
	public Response ping() {
		
		Author obj = new Author();
		
		obj.setCodigo("001");
		obj.setNombre("Mike Torres");
		
		return Response.ok().entity(obj).build();
	}
}
