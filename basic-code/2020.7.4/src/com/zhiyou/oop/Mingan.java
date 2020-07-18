package com.zhiyou.oop;

import java.util.Scanner;

/**
 * 敏感词过滤
 */
public class Mingan {
    static String[] str={"性","色情","爆炸","恐怖","枪"};

    public static void main(String[] args) {
        String str3="我有一杆枪";
        System.out.println(mingan1(str3));
    }
    public static String mingan1(String str1) {
        for (int i = 0; i < str.length; i++) {
            if(str1.contains(str[i])){
                String str2="";
                for (int j = 0; j < str[i].length(); j++) {
                    str2+="*";
                }
                str1=str1.replace(str[i],str2);
            }
        }
        return str1;
    }
}
