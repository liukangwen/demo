package com.example.demo.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCacheThreadPoolTest implements  Runnable{


    /*不会限制最大的线程数
     回收机制：每60s会回收一次（也就是说空闲线程60s以后会回收）
*/
    static ExecutorService executorService2 = Executors.newCachedThreadPool();
//     //60s会回收一次
    //Integer.MAX_VALUE----说明无限大2^31
    //自己----看样子很平均基本上是1次请求拿一个线程，可能是线程无限多吧，
    // 且拿到的线程都不会大于请求次数

    /*pool-1-thread-100--自己：100次请求最大看到100
pool-1-thread-82
pool-1-thread-84
pool-1-thread-83
pool-1-thread-78*/
//    /*
//    ool-1-thread-184-自己：200次请求最大看到200
//pool-1-thread-187
//pool-1-thread-170
//pool-1-thread-196
//pool-1-thread-200
//pool-1-thread-199*/

    public static void main(String[] args) {
        for(int i=0;i<200;i++){
            executorService2.execute(new NewCacheThreadPoolTest());
        }
        executorService2.shutdown();
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
