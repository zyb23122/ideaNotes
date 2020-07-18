package com.itguigu.demo04;

/**
 * 匿名对象：只有右边的对象，没有左边的名字和赋值运算符。
 * new 类名称();
 *
 * 注意:匿名对象只能使用唯一一次,下次再用不得不再创建一个新对象.
 * 使用建议:如果确定一个对象只需要使用唯一一次,可以使用匿名对象.
 * @author z
 * @create 2020-07-07-16:50
 */
public class Anonymous {
    public static void main(String[] args) {
        //one是对象的名字
           Person one=new Person();
           one.name="高圆圆";
           one.showName();//我叫高圆圆
        System.out.println("=========");
        new Person().name="赵又廷";
        new Person().showName();//null,3个new对象
    }
}
