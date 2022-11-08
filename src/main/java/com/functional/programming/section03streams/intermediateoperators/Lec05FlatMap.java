package com.functional.programming.section03streams.intermediateoperators;

import java.util.ArrayList;
import java.util.List;

public class Lec05FlatMap {

    /*
     * flatMap
     * Sirve para obtener elementos que están dentro de una lista
     * o un stream dentro de otro stream
     */

    public static void main(String[] args) {
        
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        
        List<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(6);

        List<Integer> c = new ArrayList<>();
        c.add(7);
        c.add(8);
        c.add(9);

        List<List<Integer>> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        list.stream()
                .flatMap(l -> l.stream()) //hace que retorne cada elemento de la lista
                .map(i -> i * 10) //luego del flatmap ya tengo cada elemento de la lista y los puedo transformar
                .forEach(l -> System.out.println(l));



    }
    
}
