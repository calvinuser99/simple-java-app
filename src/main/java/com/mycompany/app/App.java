package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "I love Jenkins";

    public App() {}

    public static void main(String[] args) {
        System.out.println("Take 2: Make a change to demonstrate Poll SCM.");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
