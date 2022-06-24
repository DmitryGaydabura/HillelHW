package com.example.lesson2.myArrayList;

import java.util.*;

public class MyArrayList extends AbstractList<Integer> implements List<Integer> {

    // Declaring the variables that will be used in the class.
    public int size;
    public int currentNumberOfElements = 0;
    int[] myArrayList;

    // A constructor. It is called when we create an object of MyArrayList class.
    public MyArrayList(int size) {
        this.size = size;
        this.myArrayList = initialFillWithZeroes(size);

    }

    /**
     * "Create an array of size `size` and fill it with zeroes."
     * <p>
     * The function is written in Java, but it's not hard to understand what's going on. The function takes in a single
     * parameter, `size`, and returns an array of integers. The array is filled with zeroes, except for the last element,
     * which is set to `1`
     *
     * @param size the size of the array
     * @return An array of size n with all zeroes except for the last element, which is 1.
     */
    public static int[] initialFillWithZeroes(int size) {
        int[] A = new int[size];
        for (int i = 0; i < size - 1; i++) {
            A[i] = 0;
        }
        return A;
    }

    /**
     * This function fills the array with 1's.
     */
    public void fillWith1() {
        for (int i = 0; i < size; i++) {
            myArrayList[i] = 1;
        }
    }


    /**
     * If the array is full, print a message and return. Otherwise, add the element to the end of the array
     *
     * @param element the element to be added to the array
     */
    public void add(int element) {
        currentNumberOfElements++;
        if (this.currentNumberOfElements > this.size) {
            System.out.println("myArrayList is full");
            return;
        }
        myArrayList[currentNumberOfElements - 1] = element;

    }

    /**
     * The function adds an element to the array at the specified index
     *
     * @param index   the index at which the specified element is to be inserted
     * @param element the element to be added to the list
     * @return True
     */
    public boolean add(int index, int element) {
        currentNumberOfElements++;
        int buffer;
        int i = 0;
        buffer = myArrayList[index + i];
        myArrayList[index + i] = element;
        i++;

        while (i < size - index) {
            int buffer2 = myArrayList[index + i];
            myArrayList[index + i] = buffer;
            i++;
            buffer = buffer2;
        }
        return true;
    }

    /**
     * If the array is empty, return true. Otherwise, return false
     *
     * @return The method isEmpty() returns true if the array is empty, and false if it is not.
     */
    @Override
    public boolean isEmpty() {
        boolean result = true;
        for (int i = 0; i < size; i++) {
            if (myArrayList[i] != 0) {
                result = false;
                break;
            }
        }
        return result;
    }


    /**
     * This function clears the array by setting all the elements to 0
     */
    @Override
    public void clear() {
        myArrayList = initialFillWithZeroes(size);
    }

    /**
     * The get function returns the value at the index of the array
     *
     * @param index the index of the element to return
     * @return The value at the index of the array.
     */
    @Override
    public Integer get(int index) {
        return myArrayList[index];
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return The size of the array.
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * It removes the element from the array.
     *
     * @param element the element to be removed
     */
    public void removeByValue(int element) {
        for (int i = 0; i < myArrayList.length; i++) {
            if (myArrayList[i] == element) {
                myArrayList[i] = 0;
            }
        }

    }

    /**
     * It removes the element at the specified index.
     *
     * @param index the index of the element to be removed
     * @return null
     */
    @Override
    public Integer remove(int index) {
        myArrayList[index] = 0;
        return null;
    }

    /**
     * This function sets the element at the specified index to the specified element
     *
     * @param index   the index of the element to replace
     * @param element the element to be stored at the specified position
     * @return null
     */
    @Override
    public Integer set(int index, Integer element) {
        myArrayList[index] = element;
        return null;
    }

    /**
     * This function fills the array with random integers.
     */
    public void fillWithRandomInt() {
        for (int i = 0; i < size; i++) {
            myArrayList[i] = (int)(Math.random() * 10);
        }
    }


    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
        return false;
    }


    @Override
    public boolean remove(Object o) {

        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void add(int index, Integer element) {
    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int indexFrom, int indexTo) {
        return null;
    }


}
