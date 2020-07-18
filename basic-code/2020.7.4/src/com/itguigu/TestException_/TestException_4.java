package com.itguigu.TestException_;

/**
 * @author z
 * @create 2020-07-10-21:29
 */
public class TestException_4 {
    public static void main(String[] args) {
        int a = 4, b = 0;
        try {
            if (b == 0) {
                throw new ArithmeticException("一个算术异常");
            } else {
                System.out.println(a + "/" + b + "=" + a / b);
            }

        } catch (ArithmeticException e) {
            System.out.println("抛出的异常为：" + e);
           // e.printStackTrace();// 输出java.lang.ArithmeticException: 一个算术异常
          //  at com.itguigu.TestException_.TestException_4.main(TestException_4.java:12)
        }
    }
}
