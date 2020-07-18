package com.itguigu.company;

/**
 * SalesEmployee的子类，有固定底薪的销售人员，工资由底薪加上销售提成部分
 */
public class BasePlusSalesEmployee extends SalesEmployee {
    private double baseSalary;
    @Override
    public String toString() {
        return "BasePlusSalesEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }



    public BasePlusSalesEmployee(String name, int birth, double sales, double royalty, double baseSalary) {
        super(name, birth, sales, royalty);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month) + baseSalary;
    }
}
