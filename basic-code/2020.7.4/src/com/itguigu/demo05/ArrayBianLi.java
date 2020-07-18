package com.itguigu.demo05;

import java.util.ArrayList;

/**集合遍历
 * @author z
 * @create 2020-07-07-20:08
 */
public class ArrayBianLi {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("东东");
        list.add("高球");
        list.add("李世民");
        list.add("贾乃亮");

        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
