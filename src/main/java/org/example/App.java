package org.example;

import io.javalin.Javalin;

public class App 
{
    public static void main( String[] args )
    {
        Javalin app = Javalin.create(confi -> confi.plugins.enableDevLogging());
        app.get("/hello", ctx -> ctx.result("hello world"));
        app.start();
    }
}
