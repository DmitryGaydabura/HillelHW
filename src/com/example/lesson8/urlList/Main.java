package com.example.lesson8.urlList;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // Creating a list of all the URLs in the file.
        ArrayList<String> everyURLList = Logic.createListOfAllURL();

        // Removing the unnecessary info from the URLs.
        Logic.normalizeURL(everyURLList);

        // Creating a HashMap that has the URL as the key and the number of times it appears as the value.
        HashMap<String,Integer> howManyTimesDoesItAppear = Logic.createMapOfAllURL(everyURLList);

        // Sorting the HashMap by the value and printing it out.
        Logic.sortMapByValueAndPrint(howManyTimesDoesItAppear);
    }
}
