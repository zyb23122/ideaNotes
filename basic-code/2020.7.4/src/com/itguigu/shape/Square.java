package com.itguigu.shape;

/**
 * @author z
 * @create 2020-07-15-16:37
 */
public class Square extends Rect implements Shape{
    private double a;




    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    @Override
    public double getA() {
        return a;
    }

    @Override
    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a*a;
    }

    @Override
    public double qirth() {
        return 4*a;
    }
}
