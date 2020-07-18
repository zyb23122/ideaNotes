package com.itguigu.api;

import java.util.Calendar;

import static java.util.Calendar.SECOND;

/**
 * @author z
 * @create 2020-07-10-21:01
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c1=Calendar.getInstance();
        //打印当前时间
        System.out.println(c1.get(Calendar.YEAR)+"年"+(c1.get(Calendar.MONTH)+1)+
                "月"+c1.get(Calendar.DAY_OF_MONTH)+"日"+c1.get(Calendar.HOUR)+
                ":"+c1.get(Calendar.MINUTE)+":"+c1.get(c1.get(SECOND)));
        //增加天数为230
        c1.add(Calendar.DAY_OF_YEAR,230);
        //打印230天后的时间
        System.out.println(c1.get(Calendar.YEAR)+"年"+(c1.get(Calendar.MONTH)+1)+
                "月"+c1.get(Calendar.DAY_OF_MONTH)+"日"+c1.get(Calendar.HOUR)+
                ":"+c1.get(Calendar.MINUTE)+":"+c1.get(c1.get(SECOND)));
    }
}
