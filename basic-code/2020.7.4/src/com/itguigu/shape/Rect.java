package com.itguigu.shape;

/**
 * @author z
 * @create 2020-07-15-16:34
 */
public class Rect implements Shape{
    private double a;
    private double b;



    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double qirth() {
        return 2*(a+b);
    }
}
