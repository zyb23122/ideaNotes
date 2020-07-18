package com.gg.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator迭代器
 *
 * @author z
 * @create 2020-07-17-22:37
 */
public class TestIterator {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        coll.add("姚明");
        coll.add("科比");
        coll.add("麦迪");
        coll.add("库里");
        coll.add("詹姆斯");

        Iterator<String> it=coll.iterator();

        while (it.hasNext()){
            String e=it.next();
            System.out.println(e);
        }
    }
}
