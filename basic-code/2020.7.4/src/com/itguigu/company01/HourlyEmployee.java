package com.itguigu.company01;

/**
 * @author z
 * @create 2020-07-14-20:33
 */
public class HourlyEmployee extends Employee{
    private double hour_salary;
    private int hours;
    public HourlyEmployee(String name, int birth,double hour_salary,int hours) {
        super(name, birth);
        this.hour_salary=hour_salary;
        this.hours=hours;
    }
    @Override
    public double getSalary(int month){
        if(hours>=0&&hours<=160){
            return super.getSalary(month)+hours*hour_salary;
        }else{
            return super.getSalary(month)+160*hour_salary+(hours-160)*hour_salary;
        }
    }
}
