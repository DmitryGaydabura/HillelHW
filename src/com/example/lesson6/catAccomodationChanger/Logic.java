package com.example.lesson6.catAccomodationChanger;

import java.util.ArrayList;

public class Logic {
    public static Cat createRandomCat() {

        int age = (int) (Math.random() * 15 ) + 1;
        int rName = (int) (Math.random() * 16);
        int rCity = (int) (Math.random() * 10);
        String[] names = {
                "Abbey",
                "Ashley",
                "Baby",
                "Brandy",
                "Caitlyn",
                "Cori",
                "Diva",
                "Dolly",
                "Erin",
                "Gabby",
                "Hussy",
                "Isha",
                "Kelly",
                "Loki",
                "Luna",
                "Mandy"
        };

        String[] cities = {
                "Kyiv",
                "Kharkiv",
                "Donetsk",
                "Odessa",
                "Dnipro",
                "Zaporizhzhya",
                "Lviv",
                "Kryvyy Rih",
                "Mykolayiv",
                "Sevastopol"};

        String name = names[rName];
        String address = cities[rCity];

        return new Cat(name,age,address);
    }

    public static void fillArrayListWithRandomCats(ArrayList<Cat> list){
        for (int i = 0; i < 10; i++) {
            list.add(Logic.createRandomCat());
        }
    }

    public static void printAllCats(ArrayList<Cat> myCats) {
        for (Cat myCat : myCats) {
            System.out.println(myCat);
        }
    }

    public static void moveToOdessa(ArrayList<Cat> myCats) {
        for (Cat myCat : myCats) {
            myCat.address = "Odessa";
        }
    }


}
