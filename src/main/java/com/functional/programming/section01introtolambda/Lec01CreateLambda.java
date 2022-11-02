package com.functional.programming.section01introtolambda;

public class Lec01CreateLambda {

    public static void main(String[] args) {

        GreetingService service1 = new GreetingService() {
            @Override
            public void greet(String name) {
                System.out.println("Saludo1: " + name);
            }
        };

        GreetingService service2 = new GreetingService() {
            @Override
            public void greet(String name) {
                System.out.println("Saludo2: " + name);
            }
        };

        service1.greet("Julio");
        service2.greet("César");

        /*Lambda es la implementación de una interfaz funcional(solo tiene un método)*/

        /*Para no hacer toda esa implementación de una interfaz se puede crear una lambda
        * porque lo único que se necesita es cambiar el mensaje; eso hace que tanto código sea
        * innecesario*/
        GreetingService helloService = (String name) -> {
            System.out.println("hello: " + name);
        };

        //También se puede escribir así:
        GreetingService helloService1 = (String name) -> System.out.println("hello1: " + name);
        GreetingService helloService2 = (name) -> System.out.println("hello2: " + name);
        //Lambda sabe que name es un String por el método declarado en la interfaz funcional GreetingService

        helloService.greet("Aarón");
        helloService1.greet("Aarón1");
        helloService2.greet("Aarón2");

        //Para practicar luego de varios días
        GreetingService service3 = name -> System.out.println(name);
        service3.greet("Goku");

    }

    //SAM: Single abstract method

    /* Agregar esta anotación si se agrega una interfaz para usar lambdas en el proyecto */
    @FunctionalInterface //sirve para indicar a java que no se puede agregar otro método
    public interface GreetingService {

        void greet(String name);

    }

}


