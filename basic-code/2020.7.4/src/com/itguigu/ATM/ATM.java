package com.itguigu.ATM;

/**
 * @author z
 * @create 2020-07-14-15:25
 */
public class ATM {
    private Card bankCard;

    public Card getBankCard() {
        return bankCard;
    }

    public void setBankCard(Card bankCard) {
        this.bankCard = bankCard;
    }

    public void plugInCard(Card bankCard){// 插卡
           //假设卡号88888888，密码666666
        if("88888888".equals(bankCard.getAccount())&&"666666".equals(bankCard.getPassword())){
            this.bankCard=bankCard;
            System.out.println(bankCard.getOwner()+"欢迎使用ATM");
        }else{
            System.out.println("插卡错误");
        }
    }
    public void returnCard(){// 退卡
        System.out.println("欢迎下次使用");
    }
    public void drawMoney(double money){// 取钱
        System.out.println("取出"+money);
        if(bankCard.getBalance()>=money) {
            bankCard.setBalance(bankCard.getBalance() - money);
            System.out.println("取钱成功");
        }else{
            System.out.println("余额不足");
        }
    }
    public void saveMoney(double money){// 存钱
        System.out.println("存入"+money);
        bankCard.setBalance(bankCard.getBalance()+money);
        System.out.println("存入成功");
    }
    public void balabceInquiry(){// 查询余额
        System.out.println("余额为："+bankCard.getBalance());
    }
}
