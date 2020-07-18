package com.itguigu.demo05;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 如果想向集合ArrayList中存储基本类型,必须使用基本类型对应的"包装类".
 * 基本类型       包装类(引用类型,保障类都位于java.lang包下)
 * byte           Byte
 * short          Short
 * int            Integer    *
 * lang           Lang
 * floot          Floot
 * double         Double
 * char           Character   *
 * boolean        Boolean
 */
public class ArrayListBasic {
    public static void main(String[] args) {
       // ArrayList<int> list0=new ArrayList<>();错误写法
        ArrayList<Integer> list0=new ArrayList<>();
        list0.add(100);
        System.out.println(list0);
        list0.get(1);
        System.out.println(list0);


    }
}
