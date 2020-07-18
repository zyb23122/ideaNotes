package com.itguigu.demo02;

/**
 * @author z
 * @create 2020-07-06-20:09
 */
public class Student {

    //对于基本类型中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变。

    private String name;//姓名
    private int age;//年龄
    private boolean male;//是不是男生

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", male=" + male +
                '}';
    }
}
