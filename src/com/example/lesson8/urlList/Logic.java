package com.example.lesson8.urlList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Logic {
    public static void start() throws FileNotFoundException {
        ArrayList<String> everyURLList = createListOfAllURL();
        normalizeURL(everyURLList);
        HashMap<String,Integer> howManyTimesDoesItAppear = createMapOfAllURL(everyURLList);
        sortMapByValueAndPrint(howManyTimesDoesItAppear);

    }

    private static void sortMapByValueAndPrint(HashMap<String, Integer> howManyTimesDoesItAppear) {
        howManyTimesDoesItAppear.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }

    private static HashMap<String,Integer> createMapOfAllURL(ArrayList<String> everyURLList) {
        HashMap<String,Integer> howManyTimesDoesItAppear = new HashMap<>();
        for (String s : everyURLList) {
            if (!howManyTimesDoesItAppear.containsKey(s)) {
                howManyTimesDoesItAppear.put(s, 1);
            } else {
                int n = howManyTimesDoesItAppear.get(s);
                howManyTimesDoesItAppear.replace(s, n + 1);
            }
        }
        return howManyTimesDoesItAppear;
    }

    private static void normalizeURL(ArrayList<String> everyURLList) {
        everyURLList.replaceAll(s -> s.split("/")[0]);
    }

    private static ArrayList<String> createListOfAllURL() throws FileNotFoundException {
        File file = new File("src/com/example/lesson8/urlList/urls");
        Scanner in = new Scanner(file);


        ArrayList<String> everyURL = new ArrayList<>();
        while (in.hasNextLine()) {
            everyURL.add(in.nextLine());
        }
        return everyURL;
    }
}
