import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting the application");

        ResourceConfig rc = new ResourceConfig()
                .packages("mm.controllers");

        HttpServer server = JdkHttpServerFactory.createHttpServer(
                URI.create("http://localhost:8080/"), rc);
        System.out.println("Server started");
    }
}