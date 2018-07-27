package com.mahendra;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import io.swagger.annotations.Api;

@Path("/service1")
@Api(value="Demo Service")
public class MyService {
	
	@GET
	public String greet(){
		return "Hello WOrld";
	}
}
