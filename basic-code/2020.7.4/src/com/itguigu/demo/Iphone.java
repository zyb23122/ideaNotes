package com.itguigu.demo;

/**
 * Iphone类
 * 属性：价格、颜色
 * 行为：发短信、打电话
 */
public class Iphone {
    double price;
    String color;

    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }

    public void sendMessage() {
        System.out.println("群发短信");
    }
}
