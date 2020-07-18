package com.itguigu.api;

import java.util.Random;
import java.util.Scanner;

/**
 * 猜数
 * 思路:
 * 1.产生一个随机数,并保持不变
 * 2.键盘输入你猜的数字;
 * 3.获取键盘输入的数字,用Scanner的nextInt方法
 * 4.判断两个数字
 *    大了,提示大了,重试;
 *    小了,提示小了,重试;
 *    猜中,结束
 * 5.重试就是再来一次,循环次数不确定,用while(true).
 * @author z
 * @create 2020-07-07-19:02
 */
public class DemoRandom02 {
    public static void main(String[] args) {
        Random r=new Random();
        int randomNum=r.nextInt(100)+1;//范围[1,100]
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("输入你猜的数字:");
            int guessNum=sc.nextInt();
            if(randomNum>guessNum){
                System.out.println("小了,重试");
            }else if(guessNum>randomNum){
                System.out.println("大了,重试");
            }else{
                System.out.println("猜对了");
                break;//不重试,结束
            }
        }
        System.out.println("游戏结束");
    }
}
