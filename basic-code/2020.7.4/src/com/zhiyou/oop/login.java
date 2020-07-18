package com.zhiyou.oop;

/**
 * @author z
 * @create 2020-07-16-19:45
 */
public class login {
    public static void main(String[] args) {
        String account = "gyuhuygybui";
        String pswd = "1324fdvsdf";
        if (panduan(account, pswd)==7) {
            System.out.println("注册成功");
        } else {
            System.out.println("注册失败");
        }

    }

    public static int panduan(String account, String pswd){
        int a=0;
        if(account.length()>=6&pswd.length()>=8){
           a+=5;
        }
//        if(pswd.contains(\d)){
//            a+=1;
//        }
//        if(pswd.contains([A-Za-z])){
//            a+=1;
//        }
        return a;
    }
}
