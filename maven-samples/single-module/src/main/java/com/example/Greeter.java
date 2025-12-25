package com.example;

/**
 * Greeter class is responsible for generating greeting messages.
 */
public class Greeter {

    /**
     * Default constructor.
     */
    public Greeter() {
        // no initialization required
    }

    /**
     * Returns a greeting message for the given person.
     *
     * @param someone the name or message of the person being greeted
     * @return a formatted greeting message
     */
    public String greet(String someone) {
        if (someone == null || someone.trim().isEmpty()) {
            return "Hello!";
        }
        return String.format("Hello, %s!", someone);
    }

    /**
     * Main method to demonstrate Greeter usage.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet("World"));
    }
}
