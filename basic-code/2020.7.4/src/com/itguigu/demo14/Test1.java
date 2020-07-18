package com.itguigu.demo14;

import java.util.Scanner;

/**
 * @author z
 * @create 2020-07-14-11:13
 */
public class Test1 {

    public static void main(String[] args) {
        String[] arr={"1","2","3","4","5"};
        Scanner sc=new Scanner(System.in);
        System.out.println("输入下标地址：");
        int i=sc.nextInt();
        if(i>=0&&i<arr.length){
            System.out.println(getByIndex(arr,i));
        }else{
            System.out.println("输入的下标不正确");
        }
        System.out.println("输入目标元素内容：");
        String a=sc.next();
        System.out.println("输入的元素内容为："+a);
        int index=getByIl(arr,a);
        if(index!=-1){
            System.out.println("对应的下标为："+index);
        }else{
            System.out.println("输入的元素不存在");
        }

    }
    public static String getByIndex(String[] arr, int i){
           return arr[i];
    }
    public static int getByIl(String[] arr, String Il){

        for (int i = 0; i < arr.length; i++) {
            if(Il.equals(arr[i])){
                  return i;
            }
        }
        return -1;
    }
}
