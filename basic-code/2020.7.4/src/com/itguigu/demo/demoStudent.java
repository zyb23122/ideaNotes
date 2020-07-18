package com.itguigu.demo;

/**
 * 对象的创建和使用
 */
public class demoStudent {
    public static void main(String[] args) {
        //1.导包
        //需要使用的student类，和demoStudent位于同一包下，所以省略导包语句

        //2.创建，格式
        //类名称 对象名=new 类名称（）；
        //根据student类创建了一个stu对象
        Student stu = new Student();
        //3.使用成员变量，格式
        //对象名，成员变量名
        System.out.println(stu.name);
        System.out.println(stu.age);

        //赋值
        stu.name = "xxx";
        stu.age = 12;
        System.out.println(stu.name);
        System.out.println(stu.age);

        //4.调用成员方法
        stu.eat();
    }
}
