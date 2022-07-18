package com.example.lesson8.treeMap;

public class Main {
    public static void main(String[] args) {
        MyTreeMap<Integer,String> myTreeMap = new MyTreeMap<>();

        for (int i = 0; i < 20; i++) {
            myTreeMap.put(i,"This String is value for myTreeMap key " + i);
        }
        for (int i = 0; i < myTreeMap.size(); i++) {
            System.out.println(myTreeMap.get(i));
        }
    }
}
