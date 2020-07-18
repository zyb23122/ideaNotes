package com.itguigu.demo14;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author z
 * @create 2020-07-14-11:44
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 设计方法: 根据下标返回数组的元素值(方法需要传入数组及下标)
        int[] arr = {1,3,45,7,9,1,4};
        System.out.println("数组的元素是 : "+ Arrays.toString(arr));
        System.out.println("请输入下标 : ");
        int index = scanner.nextInt();
        int element = getElementByIndex(arr,index);
        if(element != -10000) {
            System.out.println("根据下标"+index+"取出的元素是 : "+element);
        } else {
            System.out.println("输入的下标有误!");
        }
        System.out.println("----------------");
        // 设计方法: 根据元素找第一个出现的下标(方法需要传入数组及元素)
        System.out.println("请输入元素 : ");
        int e = scanner.nextInt();
        int i = getIndexByElement(arr,e);
        if(i != -1) {
            System.out.println("根据元素"+e+"找的下标是 : "+i);
        }else {
            System.out.println("您输入的元素在数组中不存在 !");
        }
    }

    private static int getIndexByElement(int[] arr, int e) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == e) {
                return i;
            }
        }
        return -1;
    }

    private static int getElementByIndex(int[] arr, int index) {
        if(index < 0 || index >= arr.length) {
            // -10000 错误标志
            return -10000;
        }
        return arr[index];
    }
}
