package Basics;

public class operators {
    public static void main(String[] args) {
        /* OPERATORS
        There are 4 types of Basics.operators in Java :
        1. Arithmetic Operators
        2. Assignment Operators
        3. Comparison/Relational Operators
        4. Logical Operators
        */

        int a = 4;
        int b = 2;

        /*
        A. Arithmetic Operators
        They are just like Basics.operators we used in Math. These include:
         */
        // 1. ‘+’ Add
        int sum = a + b;
        System.out.println(sum);
        //2. ‘-’ Subtract
        int diff = a - b;
        System.out.println(diff);
        // 3. ‘*’ Multiply
        int mul = a * b;
        System.out.println(mul);
        //4. ‘/’ Divide
        int div = a / b;
        System.out.println(div);
        //5. ‘%’ Modulo - Remainder of a/b
        int mod = a % b; //to remove the reminder
        System.out.println(mod);
        //6. Unary operator ( a condition where there is only one number)
        // ++a -> means first add then rest, a++ -> first consider a then add and then rest.
        System.out.println(b++); // o/p 2 (now b = 2)
        System.out.println(++b); // o/p 4 (now b = 3 because of previous line o/p)
        System.out.println(b--); // o/p 4 (now b = 4 because of previous line o/p)
        System.out.println(--b); // o/p 2 (now b = 3 because of previous line o/p)

        /*
        B. Assignment Operators
        1. = Assigns value of right operand to left operand
        2. += Adds right operand to the left operand and  assigns the result to left operand.
        3. -= Subtracts right operand from the left operand  and assigns the result to left operand.
        4. *= Multiplies the right operand with the left operand  and assigns the result to the left operand.
        5. /= Divides left operand with the right operand and  assigns the result to left operand.
        */

        /*
        C. Comparison/Relational Operators
		it defines the relation between 2 entities.
        They give a boolean value as result i.e true or false.
        Suppose : A=5 and B=10
        1. == Gives true if two operands are equal
        2. != Gives true if two operands are not equal
        3. > Gives true if left operand is more than right  operand
        4. < Gives true if left operand is less than right operand
        5. >= Gives true if left operand is more than right  operand or equal to it
        6. <= Gives true if left operand is more than right  operand or equal to it
        */

        /*
        D. Logical Operators
        They are used to connect multiple expressions or conditions  together.
        We have 3 basic logical Basics.operators.
        Suppose : A=0 and B=1
        1. && AND operator. Gives true if both operands are non zero
        2. || OR operator. Gives true if at least one of the two  operands are non-zero.
        3. ! NOT operator. Reverse the logical state of operand
        */
    }
}
