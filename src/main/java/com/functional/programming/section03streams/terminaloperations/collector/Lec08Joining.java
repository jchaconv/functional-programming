package com.functional.programming.section03streams.terminaloperations.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lec08Joining {

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

        //Concatenar en un String el resultado
        String joiningString = list.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.joining());

        System.out.println(joiningString); //AppleAppleAirplaneBallDelta

         //Concatenar en un String el resultado
         String joiningStringWithDelimeter = list.stream()
         .filter(s -> s.length() > 3)
         .distinct() // evita los repetidos: Apple|Airplane|Ball|Delta
         .collect(Collectors.joining("|"));

         System.out.println(joiningStringWithDelimeter); //Apple|Apple|Airplane|Ball|Delta
        
    }
    
}
