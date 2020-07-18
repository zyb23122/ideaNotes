package com.itguigu.demo;

import java.util.Arrays;

/**
 * 面向过程：当需要实现一个功能的时候，每一个具体的步骤都亲力亲为，详细处理每个细节。
 * 面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，来帮我做事。
 */
public class Arrays01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        //打印格式为：{1，2，3，4，5}
        //面向过程
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                System.out.print(array[i]+"]");
            }else{
                System.out.print(array[i]+", ");
            }
        }
        System.out.println();
        System.out.println("==============");
        //面向对象
        System.out.println(Arrays.toString(array));
    }
}
