package com.functional.programming.section02functionalinterfaces.assignment;

import java.util.HashMap;
import java.util.Map;

import com.functional.programming.section01introtolambda.assignment01.MathOperation;

public class Calculator {

    private static final Map<String, MathOperation> map = new HashMap<>();

    static {
        map.put("+", (a, b) -> a + b);
        map.put("-", (a, b) -> a - b);
        map.put("*", (a, b) -> a * b);
        map.put("/", (a, b) -> a / b);
    }

    public static void main(String[] args) {

        String exp  = "5 + 2 - 3 * 7 + 2 / 3";
        String exp2 = "10 / 2 * 3 - 3 / 3 * 5";
        String exp3 = "9 * 9 - 1 * 7 / 8 + 30";

        System.out.println(
            calculate(exp) //10
        );

        System.out.println(
            calculate(exp2) //20
        );

        System.out.println(
            calculate(exp3) //100
        );

        String exp4 = "5 + 2 - 3 * 7 + 2 / 3 ^ 2";
        addOperation("^", (a, b) -> (int) Math.pow(a, b));

        System.out.println(
            calculate(exp4) //100
        );

    }

    public static void addOperation(String key, MathOperation mathOperation) {
        map.put(key, mathOperation);
    }

    public static int calculate(String expression) {

        String[] expressions = expression.split(" ");
        int onScreenNumber = Integer.parseInt(expressions[0]);
        for (int i = 1; i < expressions.length; i += 2) {
            MathOperation op = map.get(expressions[i]);
            int enteredNumber = Integer.parseInt(expressions[i + 1]);
            onScreenNumber = calculate(onScreenNumber, op, enteredNumber);
        }
        return onScreenNumber;

    }

    private static int calculate(int onScreenNumber, MathOperation mathOperation, int enteredNumber) {
        return mathOperation.operate(onScreenNumber, enteredNumber);
    }

}
