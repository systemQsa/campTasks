package com.task1.randomgame.practice;

import java.util.concurrent.locks.Lock;

public class Runnable2 implements Runnable {
    private Lock lock1;
    private Lock lock2;

    public Runnable2(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        lock1.lock();
        System.out.println("Some giberish");
        lock1.unlock();
    }
}
