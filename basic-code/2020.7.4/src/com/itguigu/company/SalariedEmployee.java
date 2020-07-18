package com.itguigu.company;

/**
 * 拿固定工资的员工
 */
public class SalariedEmployee extends Employee {
    private double month_salary;

    public SalariedEmployee(String name, int birth, double month_salary) {
        super(name, birth);
        this.month_salary = month_salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "month_salary=" + month_salary +
                '}';
    }

    public double getMonth_salary() {
        return month_salary;
    }

    public void setMonth_salary(double month_salary) {
        this.month_salary = month_salary;
    }

    @Override
    public double getSalary(int month) {
        return month_salary + super.getSalary(month);
    }


}
