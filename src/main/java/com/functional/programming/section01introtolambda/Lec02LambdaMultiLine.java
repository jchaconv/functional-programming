package com.functional.programming.section01introtolambda;

public class Lec02LambdaMultiLine {

    /*Este ejemplo muestra un método con varios parámetros*/
    public static void main(String[] args) {

        GreetingService service = (firstName, lastName, age) -> {
            System.out.println("My name is :: " + firstName + " " + lastName);
            System.out.println("My age is :: " + age);
        };
        service.greet("Julio","Chacón", 35);
    }

    @FunctionalInterface
    public interface GreetingService {
        void greet(String firstName, String lastName, int age);
    }

}
