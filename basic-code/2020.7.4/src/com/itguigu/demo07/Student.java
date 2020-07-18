package com.itguigu.demo07;

/**
 * @author z
 * @create 2020-07-09-11:49
 */
 class Student extends Person{
    public Student (String name,int age,String occupation){
        super(name,age,occupation);
    }
    public String talk(){
        return "学生--姓名："+this.name+",年龄："+this.age+",职业："+this.occupation+"!";
    }
}
