package com.functional.programming.section03streams.terminaloperations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lec04MinAndMax {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");

        /* Inicio MIN */

        System.out.println(

            list.stream()
                    .min(Comparator.naturalOrder()) //ascendente
                    .get() // para evitar el Optional

        );

        System.out.println(

            list.stream()
                    .min(Comparator.reverseOrder()) //descendente
                    .get() // para evitar el Optional

        );

        /* Fin MIN */

        System.out.println("=========");
        
        /* Inicio MAX */
        System.out.println(

            list.stream()
                    .max(Comparator.naturalOrder()) //ascendente
                    .get() // para evitar el Optional

        );

        System.out.println(

            list.stream()
                    .max(Comparator.reverseOrder()) //descendente
                    .get() // para evitar el Optional

        );

        System.out.println(

            list.stream()
                    .filter(s -> s.length() > 3) //solo entrarían apple y ball
                    .max(Comparator.naturalOrder()) //ascendente
                    .get() // para evitar el Optional

        );
        /* Fin MAX */


    }
    
}
