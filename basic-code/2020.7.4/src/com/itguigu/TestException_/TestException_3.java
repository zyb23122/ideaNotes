package com.itguigu.TestException_;

import java.sql.SQLOutput;

/**
 * @author z
 * @create 2020-07-10-21:37
 */
public class TestException_3 {
    public static void main(String[] args) {
        try{
            int arr[] = new int[5];
            arr[10]=7;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界");
            System.out.println("异常："+e);
            //e.printStackTrace();
        }finally {
            System.out.println("finally一定会运行！");
        }
        System.out.println("main方法结束");
    }
}
