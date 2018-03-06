package com.example.demo.actuator.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

@Path("/resource")
public class AppResource {

	private static final Logger logger = LoggerFactory.getLogger(AppResource.class);

	@Value("spring.application.name")
	private String appName;

	@GET
	@Produces("text/plain")
	@Path("/ping")
	public String healthCheck() {
		logger.info("Executing PING Servicee");
		return "Success, App: " + this.appName + " is up and running";
	}

	@GET
	@Produces("application/json")
	@Path("/user/greeting")
	public Response getUser() {

		return Response.ok().entity("Hello Developer ! ").build();
	}

}
