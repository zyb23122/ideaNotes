package com.zhiyou.api;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 字符串反转
 * @author z
 * @create 2020-07-16-14:54
 */
public class TestString1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入想要反转的字符串");
        String str=sc.nextLine();
        System.out.println("输入的字符串是："+str);
//        char[] chars=str.toCharArray();
//先转为字符数组，反转字符数组，再转为字符串
//        for (int i = 0; i < chars.length/2; i++) {
//            char temp=chars[i];
//            chars[i]=chars[chars.length-1-i];
//            chars[chars.length-i-1]=temp;
//        }
//        String str1=new String(chars);
//        String str2=String.valueOf(chars);
//        System.out.println("反转后的字符串为："+ str1);
//        System.out.println("反转后的字符串为："+ str2);

        String str2="";
        for (int i = str.length(); i>0; i--) {

            str2+=str.charAt(i-1);
        }
        System.out.println(str2);
    }
}
