package com.example.demo.ThreadPool;

import java.util.concurrent.*;

public class ThreadPoolFive {
    // 创建线程池的方式
    // 第一种
    ExecutorService executorService1 = Executors.newFixedThreadPool(10);

    // 第二种
    ExecutorService executorService2 = Executors.newCachedThreadPool();

    // 第三种
    ExecutorService executorService3 = Executors.newSingleThreadExecutor();

    // 第四种 -- 定时任务用的比较多
    ExecutorService executorService4 = Executors.newScheduledThreadPool(10);

    // 第五种 -- JDK8 增加
    ExecutorService executorService5 = Executors.newWorkStealingPool();
    public static ExecutorService newFixedThreadPool(int nThreads) {
        return new ThreadPoolExecutor(nThreads, nThreads,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
    }
//
//    public static ExecutorService newCachedThreadPool() {
//        return new ThreadPoolExecutor(0, Integer.MAX_VALUE,
//                60L, TimeUnit.SECONDS,
//                new SynchronousQueue<Runnable>());
//    }
//    public static ExecutorService newSingleThreadExecutor() {
//        return new FinalizableDelegatedExecutorService
//                (new ThreadPoolExecutor(1, 1,
//                        0L, TimeUnit.MILLISECONDS,
//                        new LinkedBlockingQueue<Runnable>()));
//    }


}
