package com.functional.programming.section02functionalinterfaces.function;

import java.util.function.Function;

public class MainFunction {

    /* Predicate<T, R>
    * method: apply()
    * input type: T
    * return type: R
    * lambda chaining: andThen(Function), compose(Function)
    */
    public static void main(String[] args) {
        
        Function<String, Integer> strLen = s -> s.length();
        Function<Integer, Integer> square = i -> i * i;

        System.out.println(
            strLen.apply("Hola banda!") //Retorna 11
        );

        System.out.println(
            strLen.andThen(square) //El 11 es pasado a square y retorna 121
                .apply("Hola banda!")
        );

        System.out.println("===================");

        /* andThen vs compose */
        Function<Integer, Integer> plus2 = i -> i + 2;

        System.out.println(
            //10            //100
            plus2.andThen(square).apply(8)
        );

        System.out.println(
            //66            //64
            plus2.compose(square).apply(8) //retorna 66
            //Aquí primero se ejecuta square y luego plus2
        );

        //andThen a.andThen(b): a -> b
        //compose a.compose(b): b -> a

    }
    
}
