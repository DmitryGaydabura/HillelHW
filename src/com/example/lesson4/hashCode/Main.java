package com.example.lesson4.hashCode;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> allCars = new ArrayList<>();
        createAllCars(allCars);
        Utility.printField(allCars);
        Logic.equalsCheck(allCars);
        getHashcode(allCars);
        Logic.checkEveryCarForEquals(allCars);
    }

    private static void getHashcode(List<Car> allCars) {
        System.out.println("\n");
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Car\"" + i +"\" HashCode is: "+ allCars.get(i).hashCode());
        }
    }

    private static void createAllCars(List<Car> allCars) {
        for (int i = 0; i < 10; i++) {
            allCars.add(new Car(Logic.chooseRandYear(),Logic.chooseRandColor()));
        }
    }


}
