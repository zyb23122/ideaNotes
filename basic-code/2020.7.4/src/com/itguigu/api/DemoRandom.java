package com.itguigu.api;
import java.util.Random;
/**
 * Random生成随机数
 * 1.导包
 * mport java.util.Random;
 * 2.创建
 * Random r=new Random();//小括号中留空即可
 * 3.使用
 * 获取一个随机的int数字(范围是int所有范围,有正负):int num=r.nextInt();
 * 获取一个随机的int数字(参数代表了范围,左闭右开区间):int num=r.nextInt(3);
 * 实际上代表的含义是:[0,3),也就是0~2
 * @author z
 * @create 2020-07-07-17:38
 */
public class DemoRandom {
    public static void main(String[] args) {
        Random r=new Random();
        Random r1=new Random(10);

        int num=r.nextInt();
        System.out.println("随机数是:"+num);
    }
}
