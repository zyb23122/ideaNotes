package com.itguigu.company;

import java.util.Scanner;

/**
 * employee测试类
 */
public class Test {
    public static void main(String[] args) {
        Employee[] e = new Employee[4];
        e[0] = new SalesEmployee("张三", 3, 3000, 1.8);
        e[1] = new SalariedEmployee("李四", 8, 8000);
        e[2] = new HourlyEmployee("王五", 5, 20, 178);
        e[3] = new BasePlusSalesEmployee("赵六", 1, 7500, 1.5, 1000);
        Scanner sc = new Scanner(System.in);
        point:
        while (true) {
            System.out.println("请输入想要查询的员工的种类的序号：1：SalesEmployee 2：SalariedEmployee 3：HourlyEmployee 4：BasePlusSalesEmployee 5：退出查询");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("查询SalesEmployee");
                    break;
                case 2:
                    System.out.println("查询SalariedEmployee");
                    break;
                case 3:
                    System.out.println("查询HourlyEmployee");
                    break;
                case 4:
                    System.out.println("查询BasePlusSalesEmployee");
                    break;
                case 5:
                    break point;
                default:
                    System.out.println("输入错误！");
                    break;
            }
            System.out.println("请输入想要查询的月份：");
            int b = sc.nextInt();
            if (b > 0 && b <= 12) {
                System.out.println("查询的月份为：" + b);
            } else {
                System.out.println("输入错误！");
            }
            System.out.println(e[a - 1].getName() + "的" + b + "月份的工资为" + e[a - 1].getSalary(b));

        }

    }
}
