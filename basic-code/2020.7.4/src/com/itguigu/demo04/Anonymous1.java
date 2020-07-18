package com.itguigu.demo04;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author z
 * @create 2020-07-07-17:21
 */
public class Anonymous1 {
    public static void main(String[] args) {
//        //普通使用方式
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();

//        //匿名对象的方式
//        int num=new Scanner(System.in).nextInt();
//        System.out.println("输入的是:"+num);

//        //使用一般写法传入参数
//        Scanner sc=new Scanner(System.in);
//        methodParam(sc);

//        //使用匿名对象传参
//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();
        int num=sc.nextInt();
        System.out.println("输入的是:" + num);

    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是:" + num);
    }
    public static Scanner methodReturn(){
//        Scanner sc=new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
