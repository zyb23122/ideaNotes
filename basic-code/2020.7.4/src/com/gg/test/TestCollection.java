package com.gg.test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author z
 * @create 2020-07-17-22:17
 */
public class TestCollection {
    public static void main(String[] args) {
        // 创建
        Collection<String> coll=new ArrayList<>();
        // 添加
        coll.add("hello");
        coll.add("world");
        coll.add("heima");
        coll.add("java");
        System.out.println(coll);
        // 删除
//        boolean result=coll.remove("hello");
//        System.out.println(result);
//        System.out.println(coll);
        // 清空
//        coll.clear();
//        System.out.println(coll);
        // 判断是否包含。。。
        boolean result=coll.contains("java");
        System.out.println(result);
        // 判断是否为空
        boolean result1=coll.isEmpty();
        System.out.println(result1);
        // 获取长度
        System.out.println(coll.size());
        //将集合转为数组
        Object[] obj=coll.toArray();
        //遍历
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}
