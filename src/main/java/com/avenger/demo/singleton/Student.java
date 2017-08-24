package com.avenger.demo.singleton;

public class Student {
    private static final Student INSTANCE = new Student();

    private Student(){}
    public static Student getInstance(){
        return INSTANCE;
    }
}
