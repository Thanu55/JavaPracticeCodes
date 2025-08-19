package Basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /* Java has 3 loops
            - for loops
            - do while loops
            - while loops
         */
        // for Basics.Loops

        //to print from 1 - 10
        for(int i = 1; i <= 10; i++)  { //i++ -> i = i + 1
            System.out.println(i);
        }

        // to print from 10 - 1
        for(int i = 10; i >= 1; i--)  { //i-- -> i = i - 1
            System.out.println(i);
        }

        // while loops (jabthak)
        int j = 10;
        while(j >= 5) {
            System.out.println(j);
            j = j - 1;
        }

        // do while (same like while but here we run the code first then check for conditions)
        int k = 10;
        do {
            System.out.println(k);
            k = k - 1;
        } while (k >= 4) ;


        // An exercise using do while
        Scanner sc = new Scanner(System.in);
        int num = 0;

        do{
            System.out.println( "input a num");
            num = sc.nextInt();
            System.out.println("here is your number " + num);
        } while (num >= 0);

        System.out.println("The end");
    }
}
