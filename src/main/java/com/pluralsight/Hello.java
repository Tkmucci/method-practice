package com.pluralsight;

public class Hello {


    public static void main(String[] args) {

        sayHello("");
        sayGoodMorning("", "");
        sayGoodbye("");

    }
    public static void sayHello(String name) {

        System.out.println("Hello, " + name);

    }
    public static void sayGoodbye(String name) {

        System.out.println("Goodbye!" + name);


    }
    public static void sayGoodMorning(String name, String surname) {

        System.out.println("Good Morning " + name + " " + surname);

    }
}
