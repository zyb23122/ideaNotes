package com.itguigu.demo02;

/**
 * @author z
 * @create 2020-07-06-19:50
 */
public class Demo02Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "赵强";
//           person.age=18;//直接访问private内容，错误写法！
        person.setAge(20);
        person.show();
    }
}
