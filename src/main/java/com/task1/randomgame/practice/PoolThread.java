package com.task1.randomgame.practice;

import java.util.concurrent.Executors;

public class PoolThread {
    public static void main(String[] args) {
        System.out.println(Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()));
    }
}
