package com.example.demo.Optional;

import lombok.Data;
import org.junit.Test;


import java.util.Optional;

//使用Optional容器可以快速的定位NPE，并且在一定程度上可以减少对参数非空检验的代码量。
public class OptionalTest {
    /**
     *      Optional.of(T t); // 创建一个Optional实例
     *      Optional.empty(); // 创建一个空的Optional实例
     *      Optional.ofNullable(T t); // 若T不为null，创建一个Optional实例，否则创建一个空实例
     *      isPresent();    // 判断是够包含值
     *      orElse(T t);   //如果调用对象包含值，返回该值，否则返回T
     *      orElseGet(Supplier s);  // 如果调用对象包含值，返回该值，否则返回s中获取的值
     *      map(Function f): // 如果有值对其处理，并返回处理后的Optional，否则返回Optional.empty();
     *      flatMap(Function mapper);// 与map类似。返回值是Optional
     *
     *      总结：Optional.of(null)  会直接报NPE
     */

    @Test
    public void test1(){
        Optional<Employee1> op = Optional.of(new Employee1("zhansan",11,12.32));
        System.out.println(op.get());
    }


    // NPE
    @Test
    public void test2(){
        Optional<Employee1> op2 = Optional.of(null);
        System.out.println(op2);

    }


//    java.util.NoSuchElementException: No value present
    @Test
    public void test3(){
        Optional<Object> op5 = Optional.empty();
        System.out.println(op5);
        // No value present
        System.out.println(op5.get());
    }


    @Test
    public void test4(){
        Optional<Employee1> o1p = Optional.ofNullable(new Employee1("lisi", 33, 131.42));
        System.out.println(o1p.get());
        Optional<Object> op22 = Optional.ofNullable(null);
        System.out.println(op22);
//         System.out.println(op22.get());
    }


    @Test
    public void test5(){

        Optional<Employee1> op1 = Optional.ofNullable(new Employee1("张三", 11, 11.33));
        System.out.println(op1.orElse(new Employee1()));
        System.out.println(op1.orElse(null));
    }

    @Test
    public void test6(){
                Optional<Employee1> op12 = Optional.of(new Employee1("田七", 11, 12.31));
        op12 = Optional.empty();
        Employee1 Employee1 = op12.orElseGet(() -> new Employee1());
        System.out.println(Employee1);
    }

    @Test
    public void test7(){
        Optional<Employee1> op11 = Optional.of(new Employee1("田七", 11, 12.31));
        System.out.println(op11.map( (e) -> e.getSalary()).get());
    }


}

@Data
class Employee1{
    private String name;
    private int age;
    private double salary;

    public Employee1(String name, int age, double salary) {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public Employee1(){

    }
}