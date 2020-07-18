package com.itguigu.demo13;


/**
 * @author z
 * @create 2020-07-11-15:34
 */

//        ArrayList<Integer> lsit=new ArrayList<>();
//        Random r=new Random();
//        for(int i=0;i<6;i++){
//            int num=r.nextInt(33)+1;
//            list.add(num);
//        }
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

//        ArrayList<Student> lsit=new ArrayList<>();
//        Student one=new Student("牛牛",12);
//        Student two=new Student("牛牛",12);
//        Student three=new Student("牛牛",12);
//        Student four=new Student("牛牛",12);
//        lsit.add(one);
//        lsit.add(two);
//        lsit.add(three);
//        lsit.add(four);
//        for(int i=0;i<list.size();i++){
//            Student stu=list.get(i);
//            System.out.println("姓名："+stu.getName()+"年龄:"+stu.getAge());
//        }

//        1.字符串是常量，内容永不可变。
//        2.由于字符串永不可变，所以可以共享使用。
//        3.字符串效果上相当于是char[]字符数组，但底层原理是byte[]字节数组。

//        对于基本数据来说，==是进行数值的比较。
//        对于引用数据来说，==是进行地址值的比较。

//        String str = "Hello";
//        str = "Java";
//
//        String str1="How do you do?";
//        String str2=str1.replace("o","*");
//        System.out.println(str1);//How do you do?
//        System.out.println(str2);//H*w d* y*u d*?

//        String str="aaa,bbb,c";
//        String array=str.split(",");

//分析：
//1.首先准备一个int[]数组，内容是：1，2，3
//2.定义一个方法，用来将数组变成字符串
//   三要素：返回值类型 ；String
//          方法名：fromArrayToString
//          参数列表：int[]
//3.格式： [word1#word2#word3]
//  用到：for循环、字符串拼接、每个数组元素之前都有一个word字样、分割使用的是#、区分一下是不是最后一个
//4.调用方法，得到返回值，并打印结果字符串










//public class Test {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3};
//        String result = fromArrayToString(array);
//        System.out.println(result);
//    }
//
//    private static void fromArrayToString(int[] array) {
//        String str = "[";
//        for (int i = 0; i < array.length; i++) {
//            if (i == array.length - 1) {
//                str += "word" + array[i] + "]";
//            } else {
//                str += "word" + array[i] + "#";
//            }
//            return str;
//        }
//    }
//


//}
