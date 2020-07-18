package com.itguigu.company01;

/**
 * @author z
 * @create 2020-07-14-20:27
 */
public class SalariedEmployee extends Employee{
    private double month_salary;

    public SalariedEmployee(String name,int birth,double month_salary) {
        super(name,birth);
        this.month_salary = month_salary;
    }
    @Override
    public double getSalary(int month){
        return super.getSalary(month);
    }
}
