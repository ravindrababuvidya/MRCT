package com.mrct;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;



public class MyClient {
	public static void main(String[] args) {
		ClientConfig config = new ClientConfig();

        Client client = ClientBuilder.newClient(config);

        WebTarget target = client.target(getBaseURI());

        String response = target.path("rest").
                            path("hello/ravindra").
                            request().
                            accept(MediaType.TEXT_PLAIN).
                            get(Response.class)
                            .toString();


        String plainAnswer =
                target.path("rest").path("hello/ravindra").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		System.out.println("@@@@@@@ "+plainAnswer);

	}
	 private static URI getBaseURI() {
	        return UriBuilder.fromUri("http://localhost:7080/MyFirstWeb").build();
	    }
}

