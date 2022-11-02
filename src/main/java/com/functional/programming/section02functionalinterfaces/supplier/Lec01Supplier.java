package com.functional.programming.section02functionalinterfaces.supplier;

import java.util.function.Supplier;

public class Lec01Supplier {

    public static void main(String[] args) {
        
        /*
         Supplier<T> solo tiene el método get y no recibe parámetros
         */
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get()); //El get llama a la función lambda

        //Usando method reference
        Supplier<Double> random2 = Math::random;
        System.out.println(random2.get());



    }
    
}
