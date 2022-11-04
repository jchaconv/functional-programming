package com.functional.programming.section02functionalinterfaces.consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        
        /*Consumer<T> accept andThen 
         * return type: void
        */
        Consumer<String> c1 = (s) -> System.out.println(s);
        c1.accept("udemy");

        Consumer<String> c2 = System.out::println; //lo mismo con method reference
        c2.accept("business");

        System.out.println("===========");

        /* Pasando un Consumer a forEach */
        List<String> list = new ArrayList<>();
        list.add("Julio");
        list.add("Chacon");
        
        Consumer<String> c3 = System.out::println;
        list.forEach(c3);

        //Pasando directamente una lambda a forEach
        list.forEach(s -> System.out.println(s.toUpperCase()));

        System.out.println("===========");

        /* Functional Composition - Lambda Chaining */
        Consumer<String> dbConsumer = (s) -> {
            System.out.println("I'm writing into DB :: " + s);
        };
        //list.forEach(dbConsumer);

        Consumer<String> loggingConsumer = (s) -> {
            System.out.println("I'm writing into log file :: " + s);
        };
        //list.forEach(loggingConsumer);

        //Para invocar a ambos consumers:
        Consumer<String> dbLogConsumer = dbConsumer.andThen(loggingConsumer); //Tienen que ser del mismo tipo
        list.forEach(dbLogConsumer);

        System.out.println("===========");

        /* BiConsumer<T, R> acepta dos valores*/
        BiConsumer<String, Integer> biConsumer = (s, i) -> {
            System.out.println("My name :: " + s);
            System.out.println("My age :: " + i);
        };

        biConsumer.accept("Julio Cesar", 27);

        Map<String, Consumer<String>> map = new HashMap<>();
        map.put("db", dbConsumer);
        map.put("log", loggingConsumer);
        map.put("dblog", dbLogConsumer);

        //El forEach de map acepta un BiConsumer
        map.forEach((k, v) -> {
            System.out.println("key is :: " + k);
        });

    }

}
