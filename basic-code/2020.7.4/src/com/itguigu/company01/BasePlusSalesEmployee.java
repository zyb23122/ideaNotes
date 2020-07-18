package com.itguigu.company01;

/**
 * @author z
 * @create 2020-07-14-20:51
 */
public class BasePlusSalesEmployee extends SalesEmployee{
    private double dixin;

    public BasePlusSalesEmployee(String name, int birth, double xiaoshoue, double tichegnlv,double dixin) {
        super(name, birth, xiaoshoue, tichegnlv);
        this.dixin=dixin;
    }
    @Override
    public double getSalary(int month){
        return super.getSalary(month)+dixin;
    }
}
