package com.olarm.securityapp.CloudServer.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/sec")
public class SystemMainSecurity {
	
	@GET
	@Path("/{newStatus}")
	@Produces(MediaType.TEXT_PLAIN)
	public String changeSecStatus(@PathParam("newStatus") String status) {
		String answer = "";
		if(status.equalsIgnoreCase("arm")) {
			answer = "armed";
		}
		
		else if(status.equalsIgnoreCase("disarm")) {
			answer = "disarmed";
		}
		else {
			answer = "unknown request";
		}
		
		return answer;
	}
}
