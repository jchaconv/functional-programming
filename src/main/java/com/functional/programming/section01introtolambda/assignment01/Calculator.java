package com.functional.programming.section01introtolambda.assignment01;

public class Calculator {

    public static void main(String[] args) {

        /*Inicio mi solución*/
        MathOperation add = (a, b) -> a + b;
        System.out.println(add.operate(150, 777));

        MathOperation subtract = (a, b) -> a - b;
        System.out.println(subtract.operate(45, 23));

        MathOperation multiply = (a, b) -> a * b;
        System.out.println(multiply.operate(5, 250));

        MathOperation divide = (a, b) -> a / b;
        System.out.println(divide.operate(900, 3));
        /*Fin mi solución*/

        System.out.println("============");

        System.out.println(calculate(add));
    }

    //Ya tengo la data y recibo el comportamiento
    private static int calculate(MathOperation mathOperation) {
        int a = 100;
        int b = 5;
        return mathOperation.operate(a, b);
    }

}
