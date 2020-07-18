package com.itguigu.demo14;

import java.util.Scanner;

/*
题目：键盘输入一个字符串，并且统计其中各种字符串出现的次数。、
种类有：大写字母，小写字母，数字，其他

思路：
1.Scanner；
2.String str=sc.next();
3.定义四个变量，分别对应四种字符出现的次数。
4.需要对字符串逐字检查，String-->char[],方法就是toCharArray()
5.遍历char[]字符数组，对当前字符的种类进行判断。并且用四个变量++动作。
6.打印输出四个变量。
 */
public class Demo14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串： ");
        String input=sc.next();

        int countUpper=0;
        int countLower=0;
        int countNumber=0;
        int countOther=0;
        char[] charArray=input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];// 当前单个字符
            if('A'<=ch&&ch<='Z'){
                countUpper++;
            }else if('a'<=ch&&ch<='z'){
                countLower++;
            }else if('0'<=ch&&ch<='9'){
                countNumber++;
            }else{
                countOther++;
            }
        }
        System.out.println("大写字母有："+countUpper);
        System.out.println("小写字母有："+countLower);
        System.out.println("数字有："+countNumber);
        System.out.println("其他符号有："+countOther);
    }

}
