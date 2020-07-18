package com.itguigu.demo02;

/**
 * @author z
 * @create 2020-07-06-19:49
 */

/**
 * 问题描述：定义Person的年龄时，无法阻止不合理的数值被设置进来。
 * 解决方案：用private关键字将需要保护的成员变量进行修饰。
 * 一旦使用private进行修饰，那么本类当中仍然可以进行访问，
 * 但是！超出了本类范围之外就不能进行访问了。
 * <p>
 * 间接访问private成员变量，就定义一对Getter/Setter方法
 */
public class Person {
    String name;
    private int age;

    public void show() {
        System.out.println("我叫" + name + "，年龄：" + age);
    }

    //这个成员方法，专门用于向age设置数据。
    public void setAge(int num) {
        if (num < 100 && num >= 9) { //如果是合理情况
            age = num;
        } else {
            System.out.println("数据不合理！");
        }
    }

    //这个成员方法，专门用于获取agfe的数据
    public int getAge() {
        return age;
    }
}
