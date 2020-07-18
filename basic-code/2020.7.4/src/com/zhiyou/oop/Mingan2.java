package com.zhiyou.oop;

/**
 * @author z
 * @create 2020-07-16-19:33
 */
public class Mingan2 {
    static String[] str={"性","色情","爆炸","恐怖","枪"};
    public static void main(String[] args) {
        String str3="我有一杆枪";
        System.out.println(mingan(str3));
    }
    public static String mingan(String str1) {
        StringBuffer stringBuffer = new StringBuffer(str1);
        for (int i = 0; i < str1.length(); i++) {
            while (stringBuffer.toString().contains(str[i])) {
                int index = stringBuffer.indexOf(str[i]);
                if (index == -1) {
                    break;
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                for (int j = 0; j < str[i].length(); j++) {
                    stringBuffer2.append('*');
                }
                stringBuffer.replace(index, str[i].length() + index, stringBuffer2.toString());
            }
        }
        return stringBuffer.toString();
    }
}


