package com.itguigu.demo05;

/**
 * 题目:
 * 定义一个数组,用来存储3个Person对象.
 *
 * 数组的一个缺点:一旦创建,程序运行期间长度不可以发生改变.
 */
public class DemoArray {
    public static void main(String[] args) {
        //创建长度为3的数组
        Person[] arrays = new Person[3];

        Person one = new Person("丽丽", 12);
        Person two = new Person("娟娟", 13);
        Person three = new Person("乐乐", 11);
        //将one当中的地址值赋值到数组的0号元素位置
        arrays[0] = one;
        arrays[1] = two;
        arrays[2] = three;

        System.out.println(arrays[0]);
        System.out.println(arrays[1]);
        System.out.println(arrays[2]);

        System.out.println(arrays[1].getName());
    }
}
