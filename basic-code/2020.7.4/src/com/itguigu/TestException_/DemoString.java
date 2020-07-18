package com.itguigu.TestException_;

/**
 * java.lang.String类代表字符串
 * 字符串的特点:
 *    1.字符串的内容用不可变.****
 *    2.正因为字符串内容永不可变,所以字符串可以共享使用.
 *    3.字符串效果上相当于是chra[]字符数组.但是底层原理是byte[]字节数组.
 *创建字符串的常见3+1种方式.
 * 三种构造方法:
 *   public String():创建一个空白字符串,不含任何内容.
 *   public String(char[] array):根据字符数组的内容,来创建对应的字符串.
 *   public String(byte[] array):根据字节数组的内容,来创建对应的字符串.
 * 一种直接创建:
 *   String str4="hello";
 */
public class DemoString {
    public static void main(String[] args) {
         //使用空参构造
        String str1=new String();
        System.out.println("一"+str1);
        //根据字符数组创建字符串
        char[] charArray = {'A','B','C','D'};
        String str2=new String(charArray);
        System.out.println("二"+str2);
        //根据字节数组创建字符串
        byte[] byteArray={97,98,99};
        String str3=new String(byteArray);
        System.out.println("三"+str3);
        //
        String str4="hello";
        System.out.println("四"+str4);
    }
}
