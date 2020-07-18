package com.itguigu.TestException_;

/**
 * @author z
 * @create 2020-07-11-9:13
 */
public class TestException_5 {
    public static void main(String[] args) throws Exception {
        Test t=new Test();
        t.add(4,0);
    }
}
class Test{
    void add(int a,int b) throws Exception{
        int c;
        c=a/b;
        System.out.println(a+"/"+b+"="+c);
    }
}
