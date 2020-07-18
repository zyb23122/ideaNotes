package com.itguigu.demo09;

/**
 * @author z
 * @create 2020-07-09-16:37
 */
public class Zi extends Fu{

    public Zi(){
        System.out.println("子类构造方法执行！");
    }

    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}
