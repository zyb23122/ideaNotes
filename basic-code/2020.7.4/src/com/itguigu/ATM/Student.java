package com.itguigu.ATM;

/**
 * @author z
 * @create 2020-07-14-15:30
 */
public class Student {
    private String name;
    private Card bankCard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card getBankCard() {
        return bankCard;
    }

    public void setBankCard(Card bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", bankCard=" + bankCard +
                '}';
    }
}
