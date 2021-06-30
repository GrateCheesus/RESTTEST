package mm.controllers;

import javax.print.attribute.standard.Media;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Scanner;

@Path("/api/maintenanceMode")
public class mmController {
    //GET method for browser
    static String message = "-";
    @GET
    public Response GetStatus(){
        Response.ResponseBuilder rb = Response.ok(message);
        return rb.header("Access-Control-Allow-Origin", "*").build();
    }

    @GET
    @Path("/{input}")
    @Produces(MediaType.TEXT_PLAIN)
    public String PostSample(@PathParam("input") String myInput){
        message = myInput;
        return myInput;
    }

    @GET
    @Path("/reset")
    @Produces(MediaType.TEXT_PLAIN)
    public String PreSample(@PathParam("reset") String myInput) {
        message = "-";
        return "-";
    }
}
