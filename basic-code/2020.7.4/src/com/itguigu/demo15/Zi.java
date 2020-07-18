package com.itguigu.demo15;

/**
 * @author z
 * @create 2020-07-14-20:13
 */
class Zi extends Fu{
//    public int num = 20;
//    public Zi(){
//        System.out.println("zi");
//    }
//    public void show(){
//        int num = 30;
//        System.out.println(num);
//        System.out.println(this.num);
//        System.out.println(super.num);
//    }
static {
    System.out.println("静态代码块Zi");
}

    {
        System.out.println("构造代码块Zi");
    }

    public Zi() {
        System.out.println("构造方法Zi");
    }
}
