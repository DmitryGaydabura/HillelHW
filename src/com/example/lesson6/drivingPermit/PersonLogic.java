package com.example.lesson6.drivingPermit;

import java.util.ArrayList;
import java.util.List;

public class PersonLogic {
    public static void fillListWithRandomPeople(ArrayList<Person> listOfAllPersons) {
        for (int i = 0; i < 50; i++) {

            String name = PersonLogic.getRandomName();
            int age = (int) (Math.random() * 90) + 1;
            int r = (int) (Math.random() * 3);
            boolean hasDrivingLicense = age > 18 && r > 1;
            boolean hasPassport = age > 16;
            int daysSinceLastPenalty = hasDrivingLicense ? (int)(Math.random() * 730) : -1;

            listOfAllPersons.add(new Person(name, age, hasDrivingLicense,hasPassport,daysSinceLastPenalty));
        }

    }
    public static void printListOfPersons(ArrayList<Person> listOfAllPersons){
        for (Person listOfAllPerson : listOfAllPersons) {
            System.out.println(listOfAllPerson);
        }
    }

    private static String getRandomName() {
        int r = (int) (Math.random() * 20);
        List<String> names = new ArrayList<>();
        names.add("Liam     ");
        names.add("Noah     ");
        names.add("Oliver   ");
        names.add("Elijah   ");
        names.add("James    ");
        names.add("William  ");
        names.add("Benjamin ");
        names.add("Lucas    ");
        names.add("Henry    ");
        names.add("Theodore ");
        names.add("Olivia   ");
        names.add("Emma     ");
        names.add("Charlotte");
        names.add("Amelia   ");
        names.add("Ava      ");
        names.add("Sophia   ");
        names.add("Isabella ");
        names.add("Mia      ");
        names.add("Evelyn   ");
        names.add("Harper   ");
        return names.get(r);
    }

    public static List<Person> fillListWithAcceptedPeople(ArrayList<Person> listOfAllPersons) {
        ArrayList<Person> acceptedPersons= new ArrayList<>();
        for (Person listOfAllPerson : listOfAllPersons) {
            if (listOfAllPerson.hasDrivingLicense && listOfAllPerson.hasPassport && listOfAllPerson.daysSinceLastPenalty > 365) {
                acceptedPersons.add(listOfAllPerson);
            }
        }
        return acceptedPersons;
    }
}
