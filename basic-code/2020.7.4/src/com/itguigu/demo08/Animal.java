package com.itguigu.demo08;

/**
 * @author z
 * @create 2020-07-09-16:25
 * 抽象方法所在的类必须是抽象类
 *
 * 如何使用抽象类和抽象方法：
 * 1.不能直接创建new抽象类对象。
 * 2.必须用一个子类来继承抽象父类。
 * 3.子类必须覆盖重写父类所有的抽象方法。
 * 覆盖重写（实现）：去掉抽象方法的abstract关键字，然后不上方法体大括号。
 * 4.创建子类对象进行使用。
 */
public abstract class Animal {
    public abstract void eat();
    public void narmalMethod(){

    }
}
