package com.example.demo.ThreeThread;


/*
* JAVA多线程实现方式主要有三种：继承Thread类、实现Runnable接口、
* 使用ExecutorService、Callable、Future实现有返回结果的多线程。
* 其中前两种方式线程执行完后都没有返回值，只有最后一种是带返回值的。
* */

/*
*
* 但Thread本质上也是实现了Runnable接口的一个实例使用其run()
*启动线程的唯一方法就是通过Thread类的start()实例方法。
* start()方法是一个native方法，它将启动一个新线程，并执行run()方法
*
* */
public class ThreadTest extends Thread{
    public void run(){
        System.out.println("my run");
    }

    public static void main(String[] args) {
        new  ThreadTest().start();
        new  ThreadTest().start();

    }
}
