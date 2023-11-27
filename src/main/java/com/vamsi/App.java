package com.vamsi;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8500), 0);
        HttpContext context = server.createContext("/");
        context.setHandler(App::handleRequest);
        server.start();
    }

    private static void handleRequest(HttpExchange exchange) throws IOException {

        if (exchange.getRequestMethod().equals("GET")) {
            String response = "Hi there!";
            Headers headers = exchange.getResponseHeaders();
            //headers.set("Access-Control-Allow-Origin", "https://blogs.oracle.com");
            headers.set("Access-Control-Allow-Origin", "*");
            exchange.sendResponseHeaders(200, response.getBytes().length);//response code and length

            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }

        else if (exchange.getRequestMethod().equals("OPTIONS")) {
            Headers headers = exchange.getResponseHeaders();
            //headers.set("Access-Control-Allow-Origin", "https://blogs.oracle.com");
            headers.set("Access-Control-Allow-Origin", "*");
            headers.set("Access-Control-Allow-Headers", "Content-Type");
            exchange.sendResponseHeaders(204, 0);
            OutputStream os = exchange.getResponseBody();
            os.close();
        }

        else {
            exchange.sendResponseHeaders(405, -1);
        }
    }
}
