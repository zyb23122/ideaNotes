package com.itguigu.demo;

/**
 * 学生类：
 * 属性：姓名 年龄
 * 行为：吃饭 睡觉 学习
 * <p>
 * 对应到Java的类中
 * 成员变量（属性）：
 * String name;//姓名
 * int age;//年龄
 * 成员方法（行为）：
 * public void eat();//吃饭
 * public void sleep();//睡觉
 * public void study();//学习
 * 注意事项：
 * 1.成员变量是直接定义在类中的，在方法外边；
 * 2.成员方法不再写static关键字。
 */
public class Student {
    //成员变量
    String name;
    int age;

    //成员方法
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void study() {
        System.out.println("学习");
    }

}
