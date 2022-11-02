package com.functional.programming.section01introtolambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lec05MethodReferences {

    private static final List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        /*si la función es simple se puede abreviar aún más*/
        StringOperations op1 = s -> System.out.println(s);
        op1.accept("udemy");

        //method reference I
        StringOperations op2 = System.out::println; //no recibe parámetros
        op2.accept("method reference");

        System.out.println("==============");

        //method reference II
        BooleanOperations booleanOperations = (s) -> Objects.isNull(s);
        System.out.println(booleanOperations.accept("udemy"));

        //Static method call - pass a parameter
        BooleanOperations booleanOperations2 = Objects::isNull;
        System.out.println(booleanOperations2.accept(null));

        StringOperations2 stringOperations2 = (s) -> s.toUpperCase();
        System.out.println(stringOperations2.accept("julio"));

        //Given object - Instance method call
        StringOperations2 stringOperations21 = String::toUpperCase;
        System.out.println(stringOperations21.accept("uppercase"));

        System.out.println("==============");

        //method reference III
        StringOperations3 stringOperations3 = (s1, s2) -> s1.concat(s2);
        System.out.println(stringOperations3.accept("hola", " mundo"));

        //Static method call - Instance method call with parameter
        StringOperations3 stringOperations31 = String::concat;
        System.out.println(stringOperations31.accept("hola", " banda"));

        System.out.println("==============");

        //method reference IV
        StringOperations sop = s -> list.add(s);
        sop.accept("firsttext");
        System.out.println(list);

        //Given object - pass a parameter
        StringOperations sop1 = list::add;
        sop1.accept("secondtext");
        System.out.println(list);

    }

    @FunctionalInterface
    public interface StringOperations {
        void accept(String s);
    }

    @FunctionalInterface
    public interface StringOperations2 {
        String accept(String s);
    }

    @FunctionalInterface
    public interface StringOperations3 {
        String accept(String s, String s2);
    }

    @FunctionalInterface
    public interface BooleanOperations {
        boolean accept(String s);
    }
}
