package com.functional.programming.section03streams.terminaloperations.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lec09GroupingBy {

    /* Sirve para agrupar según un parámetro en específico 
     * Este tipo de agrupamiento puede ser muy útil si se tiene una lista de datos muy grande
    */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Apple");
        list.add("Airplane");
        list.add("Ball");
        list.add("Boy");
        list.add("Cat");
        list.add("Dog");
        list.add("Delta");

        // Agrupamos según el tamaño del String
        Map<Integer, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(s -> s.length()));

        System.out.println(map); // {3=[Boy, Cat, Dog], 4=[Ball], 5=[Apple, Apple, Delta], 8=[Airplane]}

        // Agrupamos según el primer caracter del String
        Map<Character, List<String>> map2 = list.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(map2);
        //{A=[Apple, Apple, Airplane], B=[Ball, Boy], C=[Cat], D=[Dog, Delta]}

    }

}
