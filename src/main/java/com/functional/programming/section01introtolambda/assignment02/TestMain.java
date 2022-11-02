package com.functional.programming.section01introtolambda.assignment02;

import com.functional.programming.section01introtolambda.assignment01.MathOperation;

public class TestMain {

    public static void main(String[] args) {

        MathOperation add      = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide   = (a, b) -> a / b;

        int onScreenNumber = 0;

        onScreenNumber = calculate(5, add, 2);
        onScreenNumber = calculate(onScreenNumber, subtract, 3);
        onScreenNumber = calculate(onScreenNumber, multiply, 7);
        onScreenNumber = calculate(onScreenNumber, add, 2);
        onScreenNumber = calculate(onScreenNumber, divide, 3);

        System.out.println(onScreenNumber); //retorna 10

    }

    /*Se quiere conseguir: 5 + 2 - 3 * 7 + 2 / 3 */
    private static int calculate(int onScreenNumber, MathOperation mathOperation, int enteredNumber) {
        return mathOperation.operate(onScreenNumber, enteredNumber);
    }

}
