package com.example.demo.ThreeThread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class ReturnThread {

    /*
    //----1.5引入
    * 使用ExecutorService、Callable、Future实现有返回结果的多线程
ExecutorService、Callable、Future这个对象实际上都是属于Executor框架中的功能类

    代码中Executors类，提供了一系列工厂方法用于创先线程池，
    返回的线程池都实现了ExecutorService接口。
想要详细了解Executor框架的可以访问http://www.javaeye.com/topic/366591
    * */


    public static void main(String[] args) {
        int size=5;
        ExecutorService executorService = Executors.newFixedThreadPool(size);
        List<Future> list = new ArrayList<>();

        for (int i = 0; i < size ; i++) {
            Callable c =new Tes(i+"");
            //执行任务并得到Future
            /*
            * ExecutoreService提供了submit()方法，传递一个Callable，或Runnable，
            * 返回Future。如果Executor后台线程池还没有完成Callable的计算，
            * 这调用返回Future对象的get()方法，会阻塞直到计算完成。
            * */
            Future f=executorService.submit(c);
            list.add(f);
        }
        executorService.shutdown();

        list.forEach(x-> {
            try {
                System.out.println(x.get().toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

    }
}

class Tes implements Callable<Object>{
    private String name;
    Tes(String name){
        this.name=name;
    }

    @Override
    public Object call() throws Exception {

        System.out.println(">>>" + name + "任务启动");
        Date dateTmp1 = new Date();
        Thread.sleep(1000);
        Date dateTmp2 = new Date();
        long time = dateTmp2.getTime() - dateTmp1.getTime();
        System.out.println(">>>" + name + "任务终止");
        return name + "任务返回运行结果,当前任务时间【" + time + "毫秒】";

    }
}