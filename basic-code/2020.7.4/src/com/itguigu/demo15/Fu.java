package com.itguigu.demo15;

/**
 * @author z
 * @create 2020-07-14-20:13
 */
public class Fu {
//    public int num = 10;
//    public Fu(){
//        System.out.println("fu");
//    }
static {
    System.out.println("静态代码块Fu");
}

    {
        System.out.println("构造代码块Fu");
    }

    public Fu() {
        System.out.println("构造方法Fu");
    }
}
