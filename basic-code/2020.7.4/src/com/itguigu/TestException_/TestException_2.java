package com.itguigu.TestException_;

/**
 * @author z
 * @create 2020-07-10-21:33
 */
public class TestException_2 {
    public static void main(String[] args) {
        try{
            int arr[] = new int[5];
            arr[10]=7;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界");
            //e.printStackTrace();
        }finally {
            System.out.println("finally一定会运行！");
        }
        System.out.println("main方法结束");
    }
}
