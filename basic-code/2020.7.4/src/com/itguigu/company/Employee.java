package com.itguigu.company;

/**
 * 所有类的父类
 */
public class Employee {
    private String name;
    private int birth;

    public Employee(String name, int birth) {
        this.name = name;
        this.birth = birth;
    }

    public double getSalary(int month) {
        if (birth == month) {
            return 100;
        } else {
            return 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birth=" + birth +
                '}';
    }
}
