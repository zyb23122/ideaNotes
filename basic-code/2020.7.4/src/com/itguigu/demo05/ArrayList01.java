package com.itguigu.demo05;
import java.util.ArrayList;
/**
 * 数组的长度不可以发生改变.
 * 但是ArrayList集合的长度可以随意变化.
 *
 * 对于ArrayList来说,有一个尖括号<E>代表泛型.
 * 泛型:装在集合中的所有元素,全是统一的什么类型.
 * 注意:泛型只能是引用类型,不能是基本类型.
 */
public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);

        list.add("盈盈");
        list.add("雪雪");
        list.add("康康");
        System.out.println(list);
    }
}
