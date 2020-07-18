package com.itguigu.api;

/**
 * @author z
 * @create 2020-07-10-19:58
 */
public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        try{
            run.exec("notepad.exe");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
