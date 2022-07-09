package com.example.lesson6.catAccomodationChanger;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cat> myCats = new ArrayList<>();
        Logic.fillArrayListWithRandomCats(myCats);

        System.out.println("Cats before moving to Odessa:");
        Logic.printAllCats(myCats);

        System.out.println("\nCats after moving to Odessa:");
        Logic.moveToOdessa(myCats);
        Logic.printAllCats(myCats);

    }


}
