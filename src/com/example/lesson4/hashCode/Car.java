package com.example.lesson4.hashCode;

import java.util.Objects;

public class Car {
    public int year;
    public String color;

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(color, car.color);
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
        return Objects.hash(year, color);
    }
}
