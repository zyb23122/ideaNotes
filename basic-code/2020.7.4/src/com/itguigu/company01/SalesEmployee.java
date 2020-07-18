package com.itguigu.company01;

/**
 * @author z
 * @create 2020-07-14-20:39
 */
public class SalesEmployee extends Employee{
    private double xiaoshoue;
    private double tichegnlv;

    public SalesEmployee(String name, int birth,double xiaoshoue,double tichegnlv) {
        super(name, birth);
        this.xiaoshoue=xiaoshoue;
        this.tichegnlv=tichegnlv;
    }
    @Override
    public double getSalary(int month){
        return super.getSalary(month)+xiaoshoue*tichegnlv;
    }
}
