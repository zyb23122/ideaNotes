package com.zhiyou.oop;

/**
 * @author z
 * @create 2020-07-16-18:55
 */
public class Student {
    private String stuNo;
    private String name;

    @Override
    public boolean equals(Object obj) {
        Student other = (Student) obj;
        if (this.stuNo.equals(other.stuNo)) {
            return true;
        }
        return false;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "姓名：" + name + '\'' +
                ", 学号'" + stuNo + '\''
                ;
    }
}
