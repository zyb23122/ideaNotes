package com.itguigu.shape;

import java.awt.*;
import java.util.Arrays;

/**
 * @author z
 * @create 2020-07-15-16:21
 */
public class Test {
    public static void main(String[] args) {
        Rect a1=new Rect();
        a1.setA(3);
        a1.setB(4);
        System.out.println("长为"+a1.getA()+"宽为"+a1.getB()+"的矩形面积为： "+a1.area());
        System.out.println("长为"+a1.getA()+"宽为"+a1.getB()+"的矩形周长为： "+a1.qirth());
        Rect a2=new Square();
        a2.setA(3);
        System.out.println("长为"+a2.getA()+"的正方形面积为： "+a2.area());
        System.out.println("长为"+a2.getA()+"的正方形周长为： "+a2.qirth());
        Cricle a3=new Cricle();
        a3.setR(3);
        System.out.println("半径为"+a3.getR()+"的圆形面积为： "+a3.area());
        System.out.println("半径为"+a3.getR()+"的圆形周长为： "+a3.qirth());
    }
}
