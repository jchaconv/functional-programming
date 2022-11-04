package com.functional.programming.section02functionalinterfaces.runnable;

import java.util.concurrent.TimeUnit;

import com.google.common.util.concurrent.Uninterruptibles;

public class MainRunnable {

    public static void main(String[] args) {
        
        //Su uso se complementa con los Threads
        Runnable r = () -> {
            Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
            System.out.println("Hola banda!");
        };

        new Thread(r).start();

        //r.run();
        System.out.println("Hi");

    }
    
}
