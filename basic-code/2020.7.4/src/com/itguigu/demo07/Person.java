package com.itguigu.demo07;

/**
 * @author z
 * @create 2020-07-09-11:45
 */
public abstract class Person {
    String name;
    int age;
    String occupation;

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public abstract String talk();

}

