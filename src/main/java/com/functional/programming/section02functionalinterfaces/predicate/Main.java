package com.functional.programming.section02functionalinterfaces.predicate;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        
        /* Predicate<T>
         * method: test()
         * return type: boolean
         * lambda chaining: and(Predicate), or(Predicate), negate()
         */

        Predicate<Integer> isGreaterThanTwo = n -> n > 2;
        Predicate<Integer> isLessThanTen = n -> n < 10;
        
        System.out.println(isGreaterThanTwo.test(1));
        System.out.println(isLessThanTen.test(5));

        System.out.println(isLessThanTen.negate().test(5));
        
        




    }
    
}
