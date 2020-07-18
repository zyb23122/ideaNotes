package com.itguigu.demo11;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author z
 * @create 2020-07-09-17:11
 */
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        int index = new Random().nextInt(list.size());
        int delta = list.remove(index);
        int money = super.getMoney();
        super.setMoney(money + delta);
    }
}
