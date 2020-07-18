package com.itguigu.demo;



/**
 * 求1~100的和
 */
public class demo01 {
    public static void main(String[] args) {
        System.out.println("1~100的和为："+getSum());
    }

    public static int getSum(){
        int sum=0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        return sum;
    }
}
