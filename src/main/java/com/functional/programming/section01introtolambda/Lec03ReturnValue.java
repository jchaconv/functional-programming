package com.functional.programming.section01introtolambda;

public class Lec03ReturnValue {

    /*Este ejemplo muestra el retorno de un valor*/
    public static void main(String[] args) {

        GreetingService service = (name) -> {
          return name.toUpperCase();
        };
        System.out.println(service.greet("juliochacon"));

        GreetingService g = n -> n.toUpperCase();
        System.out.println(g.greet("julito"));
    }

    @FunctionalInterface
    public interface GreetingService {
        String greet(String name);
    }

}
