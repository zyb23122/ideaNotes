package com.itguigu.company01;

/**
 * @author z
 * @create 2020-07-14-20:23
 */
public class Employee {
    private String name;
    private int birth;

    public String getName() {
        return name;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name, int birth) {
        this.name = name;
        this.birth = birth;
    }

    public double getSalary(int month){
        if(birth==month){
            return 100;
        }else{
            return 0;
        }
    }
}
