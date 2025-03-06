package com.example;

import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        // Create a Javalin app instance
        Javalin app = Javalin.create(config -> {
            config.http.defaultContentType = "application/json";
        }).start(7000);

        // Define GET request handlers
        app.get("/api/message1", ctx -> {
            ctx.result("{\"message\": \"Hello, this is the first message!\"}");
            ctx.contentType("application/json");
        });

        app.get("/api/message2", ctx -> {
            ctx.result("{\"message\": \"Hi there, this is the second message!\"}");
            ctx.contentType("application/json");
        });
    }
}
