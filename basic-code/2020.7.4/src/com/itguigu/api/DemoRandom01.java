package com.itguigu.api;

import java.util.Random;

/**
 * 题目:根据int变量n的值,来获取随机数字,范围是[1,n]
 * @author z
 * @create 2020-07-07-17:59
 */
public class DemoRandom01 {
    public static void main(String[] args) {
        int n=5;
        Random r=new Random();
        int result=r.nextInt(n)+1;
        System.out.println(result);
    }
}
