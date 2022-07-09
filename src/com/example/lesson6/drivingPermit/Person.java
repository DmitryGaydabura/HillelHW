package com.example.lesson6.drivingPermit;

public class Person {
    public String name;
    public int age;
    public boolean hasDrivingLicense;
    public boolean hasPassport;
    public int daysSinceLastPenalty;

    public Person(String name, int age, boolean hasDrivingLicense, boolean hasPassport, int daysSinceLastPenalty) {
        this.name = name;
        this.age = age;
        this.hasDrivingLicense = hasDrivingLicense;
        this.hasPassport = hasPassport;
        this.daysSinceLastPenalty = daysSinceLastPenalty;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasDrivingLicense=" + hasDrivingLicense +
                ", hasPassport=" + hasPassport +
                ", daysSinceLastPenalty=" + daysSinceLastPenalty +
                '}';
    }
}
