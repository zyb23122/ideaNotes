package com.zhiyou.api;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 字符串遍历
 * @author z
 * @create 2020-07-16-14:49
 */
public class TestString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.nextLine();
        System.out.println("输入的字符串是："+str);
//        char[] chars=str.toCharArray();
//        System.out.print("拆分结果： ");
//        for (int i = 0; i < chars.length; i++) {
//            System.out.print(chars[i]+"  ");
//        }// 字符数组toCharArray

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+"  ");
        }// charAt方法

//        System.out.print(str.split("")+"  ");


    }

}
