package com.wisely.ch7_2;

/**
 * Created by scofield on 17/3/15.
 */
public class Person {
    private String name;
    private Integer age;
    public Person(){
        super();
    }

    public Person(String name,Integer age){
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
