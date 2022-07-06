package com.example.lesson4.hashCode;

import java.util.Objects;

public class Car {
    public int year;
    public String color;
    private final int hash;

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", color='" + color + '\'' +
                ", hash=" + hash +
                '}';
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
        this.hash = this.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(color, car.color) && this.hashCode() == car.hashCode();
    }

    public boolean equalsByYear(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year ;
    }

    public boolean equalsByColor(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) ;
    }


    @Override
    public int hashCode() {
        char[] A = this.color.toCharArray();
        int result = 0;
        for (char c : A) {
            result += c * 17;
        }
        return ((this.year + result*31));
    }
}
