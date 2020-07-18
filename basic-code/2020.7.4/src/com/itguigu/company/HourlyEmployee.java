package com.itguigu.company;

/**
 * 按小时拿工资的员工，每月工作超出160小时的部分按照1.5倍工资发放
 */
public class HourlyEmployee extends Employee {
    private double hour_salary;
    private int hours;

    public HourlyEmployee(String name, int birth, double hours_salary, int hours) {
        super(name, birth);
        this.hour_salary = hours_salary;
        this.hours = hours;
    }


    @Override
    public double getSalary(int month) {
        double salary = 0.0;
        if (hours <= 160) {
            return super.getSalary(month) + hours * hour_salary;
        } else {
            return super.getSalary(month) + 160 * hour_salary + (hours - 160) * 1.5 * hour_salary;
        }
    }

    public double getHour_salary() {
        return hour_salary;
    }

    public void setHour_salary(double hour_salary) {
        this.hour_salary = hour_salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hour_salary=" + hour_salary +
                ", hours=" + hours +
                '}';
    }
}
