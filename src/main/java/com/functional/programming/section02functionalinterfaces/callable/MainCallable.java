package com.functional.programming.section02functionalinterfaces.callable;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class MainCallable {

    public static void main(String[] args) throws Exception {
        
        Supplier<Double> random1 = () -> Math.random();
        Callable<Double> random2 = () -> Math.random();

        System.out.println(random1.get());
        System.out.println(random2.call()); //Igual que Supplier solo que exige un Exception      

        test(random2); //Pasando el Callable

    }

    public static void test(Callable callable) throws Exception {
        System.out.println(
            callable.call()
        );
    }
    
}
