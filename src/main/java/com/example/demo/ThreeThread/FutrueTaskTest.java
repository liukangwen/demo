package com.example.demo.ThreeThread;

import java.util.concurrent.*;

//FutrueTask实现了RunnableFuture接口，毫无疑问RunnableFuture接口继承了 Runnable, Future
public class FutrueTaskTest {

   static ExecutorService service = Executors.newFixedThreadPool(10);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(new Task());


        //用ExecutorService启动
        service.submit(futureTask);
        service.shutdown();
        System.out.println(futureTask.get());


        //Thread启动
//        Thread thread = new Thread(futureTask);
//        thread.start();
//        System.out.println(futureTask.get());
    }

}


class Task implements Callable{

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
        }
        return sum;
    }
}