package com.functional.programming.section03streams.terminaloperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Lec12StreamReduce {

    /*
     * Este ejemplo muestra la suma de números en un stream
     * 
     */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        //a: sirve como acumulador
        //b: representa los valores del stream
        Optional<Integer> reduce = list.stream().reduce((a, b) -> a + b);
        System.out.println(reduce.get());

        System.out.println("======================");

        /* AL detalle sería algo así: */
        Optional<Integer> reduceDetalle = list.stream().reduce((a, b) -> {
                                                            System.out.println(a + " :: " + b);
                                                            return a +b;
                                                        });

        System.out.println(reduceDetalle.get());
        
        System.out.println("======================");

        //También se puede sumar con IntStream
        int sum = list.stream().mapToInt(a -> a).sum(); //Necesito el mapToInt para poder usar sum
        
        //Primitive streams: mapToInt, mapToDouble, mapToLong | sum() y average()
        
        System.out.println("suma con mapToInt :: " + sum);

        System.out.println("======================");

        //Loops con IntStream

        //Del 1 al 9
        IntStream.range(1, 10).forEach(i -> System.out.println("Hola banda :: " + i));

        System.out.println("===");

        //Del 1 al 10
        IntStream.rangeClosed(1, 10).forEach(i -> System.out.println("Hola banda :: " + i));



    }

}
