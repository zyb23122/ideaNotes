package com.itguigu.demo04;

/**
 * @author z
 * @create 2020-07-06-21:41
 */
public class DemoStudent {
    public static void main(String[] args) {
        Student stu1=new Student();
        stu1.setName("大灰狼");
        stu1.setAge(12);
        System.out.println("姓名:"+stu1.getName()+" 年龄:"+stu1.getAge());
        System.out.println("============");
        Student stu2=new Student("小结巴",15);
        System.out.println("姓名:"+stu2.getName()+" 年龄:"+stu2.getAge());
        stu2.setAge(22);
        System.out.println("姓名:"+stu1.getName()+" 年龄:"+stu1.getAge());
    }
}
