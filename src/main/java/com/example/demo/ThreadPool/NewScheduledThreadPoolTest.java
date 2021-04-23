package com.example.demo.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewScheduledThreadPoolTest implements Runnable{
    /*
    *  public ScheduledThreadPoolExecutor(int corePoolSize) {
        super(corePoolSize, Integer.MAX_VALUE, 0, NANOSECONDS,
              new DelayedWorkQueue());
    }
    * */
    //个人认为就是一个fix，只不过是有schedule()来进行定时执行
    static ExecutorService executorService4 = Executors.newScheduledThreadPool(10);


    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            executorService4.execute(new NewScheduledThreadPoolTest());
        }
        executorService4.shutdown();
    }

    @Override
    public void run() {
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }



}
