package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.acme.config.GreetingProperties;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingProperties properties;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return properties.message.text + ", " + properties.name.orElse("You") + properties.message.suffix;
    }


}
