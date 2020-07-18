package com.zhiyou.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author z
 * @create 2020-07-17-19:07
 */
public class TestBirth {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入你的生日的年月日");
        String str=sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(str);
        Date now=new Date();
        long birthTime=date.getTime();
        long nowTime=now.getTime();
        int day= (int) ((nowTime-birthTime)/(24*60*60*1000));
        System.out.println("我存在了："+day+"天");
    }
}
