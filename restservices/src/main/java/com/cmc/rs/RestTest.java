package com.cmc.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.cmc.entities.Test;
import com.cmc.service.TestService;

@Path("/clase")
public class RestTest {
	@Path("/metodo")
	@GET
	public String m1(){
		return "Hola mundo";
	}
	
	@Path("/insertar")
	@POST
	@Consumes("application/json")
	public String insertar(Test test){
		TestService ts = new TestService();
		ts.insertar(test);
		System.out.println("Ejecucion exitosa!!!");
		return "Se ha insertado por rest!!";
	}
}
