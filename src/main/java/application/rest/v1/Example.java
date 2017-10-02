package application.rest.v1;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.ArrayList;


@Path("hello")
public class Example {


    @GET
    public Response example() throws java.net.UnknownHostException {
        List<String> list = new ArrayList<>();
        //return a simple list of strings
        list.add("Hello World!" + java.net.InetAddress.getLocalHost().getHostName());
        return Response.ok(list.toString()).build();
    }

    


}
