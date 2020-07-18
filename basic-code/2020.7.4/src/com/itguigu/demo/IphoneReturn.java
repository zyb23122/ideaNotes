package com.itguigu.demo;

/**
 * @author z
 * @create 2020-07-06-11:42
 */
public class IphoneReturn {
    public static void main(String[] args) {
        Iphone two = getIphone();
        System.out.println(two.color);
        System.out.println(two.price);

    }

    public static Iphone getIphone() {
        Iphone one = new Iphone();
        one.price = 3299.0;
        one.color = "白色";
        return one;
    }
}
