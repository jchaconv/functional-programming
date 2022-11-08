package com.functional.programming.section03streams.intermediateoperators;

import java.util.ArrayList;
import java.util.List;

public class Lec03Peek {

    public static void main(String[] args) {
        
        //Se agrega skip
        
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

        list.stream()
            //.skip(4) //36,64,100 :: Con esto comienza a evaluar desde el 5
            .peek(i -> System.out.println("filter-received :: " + i))
            .filter(i -> i % 2 == 0)
            .limit(3)
            .peek(i -> System.out.println("map-received :: " + i))
            .map(i -> i * i) //4,16,36
            .skip(2) //estando aquí solo se queda con el 36
            .forEach(i -> System.out.println(i));


    }
    
}
