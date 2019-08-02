package com.mrct;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class FirstRestRS {
	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello World ! ";
	}
	*/
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
		System.out.println("Msg Value"+msg);
		return Response.status(200).entity(output).build();
 
	}
	@GET
	@Path("/user/{id}")
	public Response getUserById(@PathParam("id") String id) {

	   return Response.status(200).entity("getUserById is called, id : " + id).build();

	}
	
	@GET
	@Path("/user/dob/{date}/{month}/{year}")
	public Response userDob(@PathParam("date") String day,@PathParam("month") String mon,@PathParam("year") String year) {
		String output = "User Born Date "+day+" month "+mon+"year "+year;
		//Response.
		return Response.status(200).entity(output).build();
	}
}
