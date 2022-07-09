package com.example.lesson6.catAccomodationChanger;

public class Cat {

    public String name;
    public Integer age;
    public String address;

    public Cat(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
