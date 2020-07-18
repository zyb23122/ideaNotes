package com.itguigu.shape;
/**
 * @author z
 * @create 2020-07-15-16:22
 */
public class Cricle implements Shape{
    private double r;
    private final static double Pi=3.14;


    @Override
    public String toString() {
        return "Cricle{" +
                "r=" + r +
                ", Pi=" + Pi +
                '}';
    }


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }



    @Override
    public double area() {
        return Pi*r*r;
    }

    @Override
    public double qirth() {
        return 2*Pi*r;
    }
}
