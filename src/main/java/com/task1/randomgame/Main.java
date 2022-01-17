package com.task1.randomgame;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
          //Model model = new Model();
          //View view = new View();
          //Controller controller = new Controller(model,view);
          //controller.getUserInput();
           Lock lock1 = new ReentrantLock();
           Lock lock2 = new ReentrantLock();

           Thread thread1 = new Thread(){
               @Override
               public void run() {
                   lock1.lock();
                   System.out.println("Thread1");
                   //lock1.unlock();
               }
           };

           Thread thread2 = new Thread(){
               @Override
               public void run() {
                   //lock2.lock();
                   System.out.println("Thread2");
                   lock2.unlock();
               }
           };

           thread1.start();
           thread2.start();

//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
