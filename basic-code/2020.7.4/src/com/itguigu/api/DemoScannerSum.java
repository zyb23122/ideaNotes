package com.itguigu.api;

import java.util.Scanner;

/**
 * 题目:键盘输入两个int数字,并求和
 * 思路:
 * 输入要用Scanner
 * 步骤:导包,创建,使用
 * 需要的是两个数字,所以要调用两次nextInt()方法
 * 打印结果
 */
public class DemoScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字");
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("结果是:" + result);
    }
}
