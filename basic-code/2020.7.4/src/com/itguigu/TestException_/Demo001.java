package com.itguigu.TestException_;

/**
 * @author z
 * @create 2020-07-11-11:26
 */
public class Demo001 {
    public static void main(String[] args) {
        String[] arr={"一","二","三","四","五","六","日"};
        int week = 1;


        System.out.println(arr[qq(week)]);
    }
    public static int qq(int week){
        return --week;
    }
}
