package Basics;

public class Arrays {
    public static void main(String[] args) {

        /* ARRAYS
        It is about storing a list of data and the data should be of same type.
        When we declare a variable but we didn't assign a value,
        then the value will get assigned automatically like as follows:
        int = 0, boolean = false, string = null

        There are two imp functions in Array they are:
        1. Length
        2. Sort
         */

        //Array example
        int[] marks = new int[3];
        marks[0] = 99;
        marks[1] = 98;
        marks[2] = 93;
        // or can be written as follows
        //int[] marks = {99, 98, 93};
        System.out.println(marks[0]);

        //Printing on the function i.e, length
        System.out.println(marks.length);

        //sort
        System.out.println(marks[0]); // o/p is 99
        java.util.Arrays.sort(marks);
        System.out.println(marks[0]); //o/p = 93, because it has been sorted low-high

        // storing two student's marks
        //using 2d arrays, it's like maths matrix
        int [] [] finalMarks = {{97, 98, 99}, {91, 92, 93}};
        System.out.println(finalMarks[0][2]);

    }
}


