package com.itguigu.demo;

/**
 * @author z
 * @create 2020-07-06-11:30
 */
public class IPhoneParam {
    public static void main(String[] args) {
        Iphone one = new Iphone();
        one.price = 3299.0;
        one.color = "白色";

        method(one);//传递进去的参数其实是地址值
    }

    public static void method(Iphone param) {
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
