package com.functional.programming.section03streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Lec10Optional {

    /**Este ejemplo sirve para evitar un NullPointer debido a que si no se 
     * agrega Optional el método privado puede retornar null y al invocar toUpperCase
     * se puede romper la aplicación
     */

    public static void main(String[] args) {

        String a = "Ball";
        String b = "Delta";
        String c = "Apple";

        Optional<String> smallest = getSmallest(a, b, c);

        if(smallest.isPresent())
            System.out.println(smallest.get().toUpperCase());
        else
            System.out.println("no value found");

    }

    private static Optional<String> getSmallest(String var1, String var2, String var3) {
        return Stream.of(var1, var2, var3)
                    .min(Comparator.naturalOrder());
    }

}
