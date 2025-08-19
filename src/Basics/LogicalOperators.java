package Basics;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        /* LOGICAL OPERATORS
        && 'and' operator both should be true to get true
        || 'or'
        !  'not' reverse the logical state
        */
        Scanner sc2 = new Scanner(System.in);
        //pen = 10; notebook = 40

        System.out.println("How much cash do you have?");
        int cash = sc2.nextInt();
        if (cash < 10) {
            System.out.println("Cannot buy anything");
            System.out.println("get more cash");
        } else if (cash >= 10 && cash < 50) {
            System.out.println(" Can buy a pen");
        }
        else {
            System.out.println("Can get anything");
        }
    }
}
