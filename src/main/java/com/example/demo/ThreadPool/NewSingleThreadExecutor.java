package com.example.demo.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewSingleThreadExecutor implements Runnable {
    //单线程池
    static ExecutorService newThreadPoolTest = Executors.newSingleThreadExecutor();
    //
    /*
    *        (new ThreadPoolExecutor(1, 1,
                                    0L, TimeUnit.MILLISECONDS,
                                    new LinkedBlockingQueue<Runnable>()));
    * */
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            newThreadPoolTest.execute(new NewSingleThreadExecutor());
        }
        newThreadPoolTest.shutdown();
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
