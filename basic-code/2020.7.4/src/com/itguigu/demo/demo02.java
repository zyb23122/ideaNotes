package com.itguigu.demo;

/**
 * 打印指定次数的HelloWord
 */
public class demo02 {
    public static void main(String[] args) {
        printCount(10);
    }

    /*
     三要素：
     返回值类型：只打印，无计算
     方法名称：printCount
     参数列表：打印已知的指定次数
     */
    public static void printCount(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("HelloWord" + (i + 1));
        }
    }
}
