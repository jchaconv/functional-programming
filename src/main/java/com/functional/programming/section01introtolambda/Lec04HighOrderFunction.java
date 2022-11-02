package com.functional.programming.section01introtolambda;

public class Lec04HighOrderFunction {

    /*Este ejemplo muestra que se puede recibir una función como parámetro*/
    public static void main(String[] args) {

        GreetingService g1 = n -> n.toUpperCase();
        test(g1); //paso como referencia

        test(n -> n.toUpperCase() + " como funcion"); //paso como función

        String ss = getLambda().greet("data");
        System.out.println(ss);

        String ss2 = getLambda2().greet("datados");
        System.out.println(ss2);

    }

    /*POO: Se recibe la data y contiene el comportamiento*/
    public static void convertToUppercase(String s) {
        String returnedString = s.toUpperCase();
        System.out.println(returnedString);
    }

    /*Functional: Se recibe el comportamiento y contiene la data*/
    public static void test(GreetingService gs) {
        String returnedString = gs.greet("udemy");
        System.out.println(returnedString);
    }

    public static GreetingService getLambda() {
        GreetingService g = (s) -> s.toUpperCase(); //asignando una función a una variable
        return g;
    }

    public static GreetingService getLambda2() {
        return (s) -> s.toUpperCase();
    }

    @FunctionalInterface
    public interface GreetingService {
        String greet(String name);
    }

}
