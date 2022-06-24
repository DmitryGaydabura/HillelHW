package com.example.lesson2.myArrayList;

public class Main {
    public static void main(String[] args) {
        // It creates an array of size 10.
        MyArrayList A = new MyArrayList(10);


        // Printing the initial array.
        System.out.print("Initial Array looks like this:                      ");
        printMyArray(A);

        // Adding 1,2,3 to the array.
        System.out.print("add(1),add(2),add(3):                               ");
        A.add(1);
        A.add(2);
        A.add(3);
        printMyArray(A);

        // It adds 9 to the beginning of the array.
        System.out.print("add(int index, int element) (in this case 0,9):     ");
        A.add(0, 9);
        printMyArray(A);

        // It removes the first element of the array.
        System.out.print("boolean remove (int index)(0):                      ");
        A.remove(0);
        printMyArray(A);

        // Printing the value of the first element of the array.
        System.out.print("get(int index)(0):                                  " + A.get(0) + "\n");

        // It clears the array.
        System.out.print("void clear():                                       ");
        A.clear();
        printMyArray(A);

        // Printing the value of the method isEmpty() which returns a boolean value.
        System.out.print("boolean isEmpty():                                  " + A.isEmpty() + "\n");

        // It fills the array with 1.
        System.out.print("fillWith1():                                        ");
        A.fillWith1();
        printMyArray(A);

        // It removes the value 1 from the array.
        System.out.print("removeByValue()(1):                                 ");
        A.removeByValue(1);
        printMyArray(A);

        System.out.print("fillWithRandomInt():                                ");
        A.fillWithRandomInt();
        printMyArray(A);

        // Setting the value of the first element of the array to 1.
        System.out.print("set(int index, int value)(0,1):                     ");
        A.set(0, 1);
        printMyArray(A);

        // Printing the value of the method size() which returns the size of the array.
        System.out.print("int size():                                         " + A.size() + "\n");
    }

    /**
     * It prints the array.
     *
     * @param A The array to be printed
     */
    private static void printMyArray(MyArrayList A) {
        System.out.print("{ ");
        for (int i = 0; i < A.size; i++) {
            System.out.print(A.get(i) + " ");
        }
        System.out.print("}\n");
    }
}
