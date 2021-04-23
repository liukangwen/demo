package com.example.demo.ThreeThread;

public class RunnableTest implements  Runnable {
    @Override
    public void run() {
        System.out.println("test run");
    }

    public static void main(String[] args) {
        //用Runnable的run，用Thread的start
        new Thread(new RunnableTest()).start();
    }
}
