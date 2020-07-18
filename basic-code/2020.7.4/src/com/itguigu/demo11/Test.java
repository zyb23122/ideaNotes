package com.itguigu.demo11;

import java.util.ArrayList;

/**
 * @author z
 * @create 2020-07-09-17:16
 */
public class Test {
    public static void main(String[] args) {
        Manager manager=new Manager("群主",100);
        Member one=new Member("A",0);
        Member two=new Member("B",0);
        Member three=new Member("C",0);
        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===============");
        ArrayList<Integer> redList = manager.send(20,3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();

    }

}
