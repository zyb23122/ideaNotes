package com.itguigu.light;

/**
 * @author z
 * @create 2020-07-15-14:27
 */
public class Test {
    public static void main(String[] args) {
        Buble buble1=new RedBuble();
        Buble buble2=new GreenBuble();
        Lamp lamp=new Lamp(buble1);
        lamp.on(buble1);
    }

}
