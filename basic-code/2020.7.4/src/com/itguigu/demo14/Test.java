package com.itguigu.demo14;

/**
 * @author z
 * @create 2020-07-14-9:28
 */
public class Test {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            int a=i/100;
            int b=(i%100)/10;
            int c=i%10;
            if((a*a*a+b*b*b+c*c*c)==i){
                System.out.println(i);
            }
        }
    }
}
