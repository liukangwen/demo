package com.example.demo.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewWorkStealingPoolTest implements Runnable {

    /*
    *  return new ForkJoinPool
            (Runtime.getRuntime().availableProcessors(),
             ForkJoinPool.defaultForkJoinWorkerThreadFactory,
             null, true);
    * */
    //JDK1.8新增，fok
   static ExecutorService executorService5 = Executors.newWorkStealingPool();

    public static void main(String[] args) {
        for (int i = 0; i <2000 ; i++) {
            executorService5.execute(new NewWorkStealingPoolTest());
        }
//        executorService5.shutdownNow();//不管有没有完成就关闭
        executorService5.shutdown();//任务结束后关闭
    }

    @Override
    public void run() {
        try {
            Thread.sleep(0);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
