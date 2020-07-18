package com.zhiyou.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 去除字符串的重复字符
 * @author z
 * @create 2020-07-16-15:25
 */
public class TestString2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str=sc.nextLine();
        System.out.println("输入的字符串是："+str);
        System.out.println(qvchu(str));

    }
    public static String qvchu(String str){
        char[] s=str.toCharArray();
        StringBuffer result =new StringBuffer();
        for (int i = 0; i <str.length() ; i++) {
            result.append(s[i]);
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                     s[j]=' ';
                }
            }
        }
        return result.toString();
    }
}
