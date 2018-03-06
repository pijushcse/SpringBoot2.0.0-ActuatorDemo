package com.example.demo.actuator.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
    	packages("com.example.demo.actuator.jersey");
    }
}
