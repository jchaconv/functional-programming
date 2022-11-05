package com.functional.programming.section03streams;

import java.util.ArrayList;
import java.util.List;

public class Lec01IntroStream {

    public static void main(String[] args) {

        /*
         * Stream Operations ::
         *      Intermediate: Returns new streams. Lazy 
         *          filter, map, limit, skip, distinct, sorted, flatMap, peek
         *      Terminal: Stream is consumed. Can not be reused. 
         *          forEach, collect, count, min, max, findAny, anyMatch, noneMatch
         */

        /*
         * Intermediate Operations / Input Data Type:
         * 
         * filter - Predicate <T>
         * map - Function<T,R>
         * limit - long
         * skip - long
         * peek - Consumer<T> :: just for debugging
         * distinct - N/A
         * sorted - Comparator
         * flatMap - Function<T, R>
         *  
         */ 
        
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
         * limit - 3
         * elevar al cuadrado
         */
        list.stream()
            .filter(i -> i % 2 == 0)
            .limit(3) //la ejecución termina cuando llega a 3
            .map(i -> i * i)
            .forEach(i -> System.out.println(i)); //es indispensable el terminal operator para que se ejecute el pipeline

        System.out.println("==========");

        //Al añadir los mensajes se nota una trazabilidad más detallada
        list.stream()
            .filter(i -> {
                System.out.println("filter-received :: " + i);
                return i % 2 == 0;
            })
            .limit(3)
            .map(i -> {
                System.out.println("map-received :: " + i);
                return i * i;
            })
            .forEach(i -> System.out.println(i));        



    }
    
}
