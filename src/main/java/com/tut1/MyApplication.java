package com.tut1;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/tut1")
public class MyApplication extends ResourceConfig {

	public MyApplication() {
		packages("com.tut1");
	}
}
