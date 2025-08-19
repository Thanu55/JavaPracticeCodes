package Basics;

import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        /* MINI PROJECT
        - We'll generate a random numbers from 1 to 100
        - We'll let the user to guess the number
        - If the guessed number is greater or lesser than the random number
        we will notify the user about the same
        - Once the user is tiered they can stop by entering a negative number
         */
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.println("Guess the number: ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("WooHoo.. It's a CORRECT number!");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("Your number is large!");
            }
            else {
                System.out.println("Your number is small!");

            }
        } while (userNumber >= 0);
        System.out.println("My number is " + myNumber);
    }
}
