package com.example.demo.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolTest implements Runnable{

    //固定线程池
    static ExecutorService executorService1 = Executors.newFixedThreadPool(3);

    /*
    *pool-1-thread-3
     pool-1-thread-1
     pool-1-thread-2
pool-1-thread-1
pool-1-thread-3
   pool-1-thread-2
    pool-1-thread-2
    * 所以说呢，newFixedThreadPool生成的是固定线程数的线程池。
如果任务数 > 线程数量，那么会把剩余的任务放在任务队列里，然后通过线程不断从任务队列里取任务执行；
    * */
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            executorService1.execute(new FixedThreadPoolTest());
        }
        executorService1.shutdown();
    }


    @Override
    public void run() {
        try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
