package com.itguigu.ATM;

/**
 * @author z
 * @create 2020-07-14-15:37
 */
public class Test {
    public static void main(String[] args) {
        //一个人
        Student stu=new Student();
        stu.setName("张三");
          //去银行半张卡
        Card bankCard=new Card();
        bankCard.setAccount("88888888");
        bankCard.setPassword("666666");
        bankCard.setOwner("张三");
        bankCard.setBalance(100);
        //去ATM
        ATM atm=new ATM();
        atm.plugInCard(bankCard);
        atm.getBankCard().getBalance();
        atm.saveMoney(100);
        atm.getBankCard().getBalance();
        atm.saveMoney(140);
        atm.getBankCard().getBalance();

    }
}
