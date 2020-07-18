package com.itguigu.company;

/**
 * 销售人员，工资由月销售额和提成率决定
 */
public class SalesEmployee extends Employee {
    private double sales;
    private  double royalty;

    public SalesEmployee(String name, int birth,double sales,double royalty) {
        super(name, birth);
        this.sales=sales;
        this.royalty=royalty;
    }


    @Override
    public double getSalary(int month) {
        return sales*royalty+super.getSalary(month);
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double getRoyalty() {
        return royalty;
    }

    public void setRoyalty(double royalty) {
        this.royalty = royalty;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "sales=" + sales +
                ", royalty=" + royalty +
                '}';
    }
}
