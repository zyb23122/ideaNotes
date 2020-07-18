package com.itguigu.demo05;

import java.util.ArrayList;

/**
 * ArrayList当中的常用方法:
 * public boolean add(E e):向集合当中添加元素,参数的类型和泛型一致.返回值代表添加是否成功.
 * 对于ArrayList集合来说,add一定成功,所以返回值可用可不用
 * 但是对于其他集合(今后学习)来说,add不一定成功.
 * public E get(int index):从集合中获取元素,参数是索引编号,返回值就是对应位置的元素.
 * public E remove(int index):删除索引处的元素
 * public int size():获取集合的尺寸长度.返回值是集合包含的元素个数.
 */
public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //向集合添加元素
        Object e;
        boolean sucess = list.add("刘艳");
        System.out.println(list);
        System.out.println("添加是否成功:" + sucess);

        list.add("高球");
        list.add("李世民");
        list.add("贾乃亮");
        System.out.println(list);

        //从集合中获取元素,索引从0开始
        String name = list.get(2);
        System.out.println("第2号索引位置:" + name);

        //从集合中删除元素,索引从0开始
        String whoRemoved = list.remove(2);
        System.out.println("被删除的是:" + whoRemoved);
        System.out.println(list);

        int size = list.size();
        System.out.println("集合的长度是:"+size);
    }
}
