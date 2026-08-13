package com.example;

public class Greeter {

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, World!";
        }
        return "Hello, " + name + "!";
    }

    public String farewell() { return "Goodbye!"; }
}
