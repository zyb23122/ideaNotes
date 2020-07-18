package com.itguigu.ATM;

/**
 * @author z
 * @create 2020-07-14-15:30
 */
public class Card {
    private int length;
    private int width;
    private int height;
    private String bankNane;
    private String type;
    private String account;
    private String password;
    private double balance;
    private String owner;

    public Card() {
    }

    public Card(int length, int width, int height, String bankNane, String type, String account, String password, double balance, String owner) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.bankNane = bankNane;
        this.type = type;
        this.account = account;
        this.password = password;
        this.balance = balance;
        this.owner = owner;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBankNane() {
        return bankNane;
    }

    public void setBankNane(String bankNane) {
        this.bankNane = bankNane;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Card{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", bankNane='" + bankNane + '\'' +
                ", type='" + type + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", owner='" + owner + '\'' +
                '}';
    }
}
