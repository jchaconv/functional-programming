package com.functional.programming.section03streams.intermediateoperators;

import java.util.ArrayList;
import java.util.List;

public class Lec04MoreMapAndFilter {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        /*
         * Números pares
         * Mayores que 5
         * elevar al cuadrado
         * añadir 2
         */
        list.stream()
                .filter(i -> i % 2 == 0 && i > 5)
                //.filter(i -> i > 5) //también puede ser así
                .map(i -> (i * i) + 2)
                .forEach(i -> System.out.println(i)); //38, 66, 102

    }

}
