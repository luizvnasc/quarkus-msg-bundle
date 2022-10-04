package br.com.bighead;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class MessageResource {
    @Inject
    MessageService service;

    @GET
    public String hello(@QueryParam("name") String name){
        return service.hello(name);
    }
}
