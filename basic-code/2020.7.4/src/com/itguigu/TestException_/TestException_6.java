package com.itguigu.TestException_;

/**
 * @author z
 * @create 2020-07-11-9:54
 */
public class TestException_6 {
    public static void main(String[] args) {
        try{
            // 在这里用throw直接抛出一个DefaultException类的实例对象
            throw new DefaultException("自定义异常");
        } catch (DefaultException e) {
            //e.printStackTrace();
            System.out.println(e);
        }

    }
}
class DefaultException extends Exception{
    public DefaultException(String msg){
        //调入Exception类的构造方法，存入异常信息
        super(msg);
    }
}
