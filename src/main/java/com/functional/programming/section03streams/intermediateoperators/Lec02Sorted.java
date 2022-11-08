package com.functional.programming.section03streams.intermediateoperators;

import java.util.ArrayList;
import java.util.List;

public class Lec02Sorted {

    public static void main(String[] args) {

        /*Este operation tiene cierta utilidad dependiendo del orden en donde se encuentre
        en el pipeline */
        
        List<Integer> list = new ArrayList<>();
        
        // lista desordenada
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(10);

        list.stream()
            .filter(i -> {
                System.out.println("filter-received :: " + i);
                return i % 2 == 0;
            })
            //.sorted() //en esta posición recorre toda la lista
            .limit(3)
            .sorted() // 8, 2, 4 => 2, 4, 8 :: aquí solo ordena los tres valores
            .map(i -> {
                System.out.println("map-received :: " + i);
                return i * i;
            })
            .forEach(i -> System.out.println(i));


    }
    
}
