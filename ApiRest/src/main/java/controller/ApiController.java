package controller;


import javax.faces.el.PropertyResolver;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
@Path("/hola")
public class ApiController extends Application {

    @GET
    @Path("/mundo")
    @Produces("/Aplication/json")
    public String getMessage (){
        return "Hola amigos";
    }

}
