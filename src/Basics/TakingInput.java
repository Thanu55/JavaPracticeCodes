package Basics;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args){

        /* TAKING INPUT
        take the input and print it out
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String Name = sc.nextLine();
        System.out.println("Your name is: " + Name);
        System.out.println("Enter your age: ");
        int Age = sc.nextInt();
        System.out.println("Your age:" + Age);

    }
}
