package com.zhiyou.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author z
 * @create 2020-07-17-19:43
 */
public class Xianxing {
    public static void main(String[] args) throws ParseException {
        String[] xqt = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Scanner sc = new Scanner(System.in);
        System.out.println("输入车牌");
        String cp = sc.next();
        System.out.println("车牌为：" + cp);
        char c = getLastNum(cp);
        System.out.println("最后一个数字是" + c);
        System.out.println("输入日期");
        String rq = sc.next();
        System.out.println("输入的日期为" + rq);
        int a1=getWeek(rq);
        int a2=getNow();
        System.out.println("这一天是"+xqt[a1]+xX(a1,c));
        System.out.println("-----------");
        System.out.print("今天是"+xqt[a2]+xX(a2,c));
        // 输入的月份应该改是 a-1(计算机存储的月份是0-11）
    }

    static char getLastNum(String cp) {
        char[] chars = cp.toCharArray();
        char num = ' ';
        for (int i = chars.length - 1; i > 0; i--) {
            if (Character.isDigit(chars[i])) {
                num = cp.charAt(i);
                return num;
            }
        }
        return 0;
    }

    static int getWeek(String rq) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(rq);
        Calendar cal = Calendar.getInstance();
        try {
            cal.setTime(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int k = cal.get(Calendar.DAY_OF_WEEK)-1;
        return k;
    }
    static int getNow() throws ParseException {

        Date d1 = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(d1);
        int k = cal.get(Calendar.DAY_OF_WEEK)-1;
        return k;
    }
    static String xX(int a,char c){
        if(a==1&(c==1||c==6)){
                return "限行";
        }
        else if(a==2&(c==2||c==7)){
            return "限行";
        }
        else if(a==3&(c==3||c==8)){
            return "限行";
        }
        else if(a==4&(c==4||c==9)){
            return "限行";
        }
        else if(a==5&(c==5||c==0)){
            return "限行";
        }
        return "不限行";
    }
}
