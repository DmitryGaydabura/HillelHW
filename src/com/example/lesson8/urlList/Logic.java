package com.example.lesson8.urlList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Logic {

    public static ArrayList<String> createListOfAllURL() throws FileNotFoundException {
        File file = new File("src/com/example/lesson8/urlList/urls");
        Scanner in = new Scanner(file);
        ArrayList<String> everyURL = new ArrayList<>();

        // Adding every line in the file to the ArrayList.
        while (in.hasNextLine()) {
            everyURL.add(in.nextLine());
        }
        return everyURL;
    }

    public static void normalizeURL(ArrayList<String> everyURLList) {
        everyURLList.replaceAll(s -> s.split("/")[0]);
    }

    public static HashMap<String, Integer> createMapOfAllURL(ArrayList<String> everyURLList) {
        HashMap<String, Integer> howManyTimesDoesItAppear = new HashMap<>();
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

    public static void sortMapByValueAndPrint(HashMap<String, Integer> howManyTimesDoesItAppear) {
        howManyTimesDoesItAppear.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}
