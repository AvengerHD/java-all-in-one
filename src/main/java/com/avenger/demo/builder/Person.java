package com.avenger.demo.builder;

public class Person {
    private final String name;
    private final int age;
    private final Boolean gender;

    public static class Builder {
        private String name = "";
        private int age = 0;
        private boolean gender = false;

        public Builder() {
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder gender(boolean gender){
            this.gender = gender;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    private Person(Builder builder){
        name = builder.name;
        age = builder.age;
        gender = builder.gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Boolean getGender() {
        return gender;
    }
}
