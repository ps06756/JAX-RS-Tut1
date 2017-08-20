package com.tut1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("hello")
public class Hello {

	@GET
	@Path("sayHello")
	public Response sayHello() {
		return Response.ok("Hello World in JAX-RS using Jersey 2.0").build();
	}
}
