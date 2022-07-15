package com.example.lesson6.drivingPermit;

import java.util.ArrayList;

public class personCheck {
    public static void main(String[] args) {

        System.out.println("Random persons list:");
        ArrayList<Person> listOfAllPersons = new ArrayList<>();
        PersonLogic.fillListWithRandomPeople(listOfAllPersons);
        PersonLogic.printListOfPersons(listOfAllPersons);

        System.out.println("\nList of persons, who can drive a car:");

        ArrayList<Person> listOfAcceptedPersons = (ArrayList<Person>) PersonLogic.fillListWithAcceptedPeople(listOfAllPersons);
        PersonLogic.printListOfPersons(listOfAcceptedPersons);


    }
}
