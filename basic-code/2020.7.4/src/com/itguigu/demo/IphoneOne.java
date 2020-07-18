package com.itguigu.demo;


public class IphoneOne {
    public static void main(String[] args) {
        //根据Iphone类创建一个one对象
        Iphone one = new Iphone();
        System.out.println(one.price);
        System.out.println(one.color);

        one.price = 3299.0;
        one.color = "白色";
        System.out.println(one.price);
        System.out.println(one.color);

        one.call("JJ");
        one.sendMessage();
    }
}
