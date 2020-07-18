package com.itguigu.demo02;

/**
 * @author z
 * @create 2020-07-06-20:25
 */
public class Demo02Student {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setName("鹿晗");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名："+stu.getName());
        System.out.println("年龄："+stu.getAge());
        System.out.println("是不是男生："+stu.isMale());
    }
}
