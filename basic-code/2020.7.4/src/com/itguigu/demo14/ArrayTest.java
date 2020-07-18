package com.itguigu.demo14;

import java.util.Arrays;

/*
。题目：使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印
 */
public class ArrayTest {
    public static void main(String[] args) {
        String str="auiaruhifanv";
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}

//java.util.Math
//public static double abs(double num):获取绝对值，有多种重载。
//public static double ceil(double num):向上取整
//public static double floor(double num):向下取整
//public static double round(double num):四舍五入
//Math.PI :近似的圆周率常量（double）
//修饰符 class 外部类名称{
//    修饰符 class 内部类名称{
//        //...
//    }
//    //...
//}// 注意：内用外，随意访问；外用内，需要内部类对象。

//调用方式：
//1.间接方式：在外部类的方法中，使用内部类，然后main只是调用外部类的方法。
//2.直接方式：公式：
//外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();

//重名现象：外部类名称.this.外部类成员变量名

//修饰符 class 外部类名称{
//    修饰符 返回值类型 外部类方法名（参数列表）{
//        class 局部内部类名称{
//            //...
//        }
//    }
//}

//权限修饰符规则：
//1.外部类： public/(default)
//2.成员内部类：public/protected/(default)/protected
//3.局部内部类：什么都不能写

//接口名称 对象名 = 接口名称(){
//    //覆盖重写所有抽象方法
//        };

//MyInterface obj = new Myinterface(){
//    @Override
//    public void method(){
//        System.out.println("匿名内部类重写的方法");
//    }
//}；