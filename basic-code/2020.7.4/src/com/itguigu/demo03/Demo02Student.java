package com.itguigu.demo03;

/**
 * @author z
 * @create 2020-07-06-20:58
 */
public class Demo02Student {
    public static void main(String[] args) {
        Student stu1=new Student();
        Student stu2=new Student("王大锤",200);
        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());
        //如果需要改变对象当中的成员变量的数据内容，仍需要使用setXxx方法
        stu2.setAge(201);//改变年龄
        System.out.println("姓名："+stu2.getName()+"年龄："+stu2.getAge());
    }
}
