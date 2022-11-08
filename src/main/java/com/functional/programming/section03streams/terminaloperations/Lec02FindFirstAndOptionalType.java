package com.functional.programming.section03streams.terminaloperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lec02FindFirstAndOptionalType {

    public static void main(String[] args) {

        /*
         * findFirst usa el optional por si no se satisface la condición del filter
         */

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");

        Optional<String> op = list.stream()
                                    .filter(s -> s.length() > 3)
                                    .findFirst();

        if(op.isPresent()) {
            System.out.println(op.get()); // así ya no retorna el Optional
        }                                    

        // los que tengan más de tres letras
        System.out.println(

            list.stream()
                    .filter(s -> s.length() > 3)
                    .findFirst() //Por si solo retorna: Optional[apple]

        );

    }

}
