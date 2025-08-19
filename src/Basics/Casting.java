package Basics;

public class Casting {
    public static void main(String[] args) {
        /* CASTING
        It is something which converts from one type to another type
        or assigning values of one type to another.
        The types being considered here are compatible i.e. we can only assign values
        of a number type to another type storing numbers (vice-versa is not allowed
        i.e. floating values cannot be assigned to boolean data types).

        It is not possible to convert numbers to string or something like that

        Basics.Casting in Java is of 2 types:
        1. Implicit casting
        2. Explicit casting
         */

        //Implicit casting example:
        //This casting is done by java implicitly i.e. on its own. It is assigning smaller value to larger data types.
        float price = 100.00F;
        int gst = 18;
        float finalPrice = price + gst;
        System.out.println(finalPrice);

        //Explicit casting
        //This casting is done by the programmer. It is assigning larger values to smaller data types.
        int pri = 100;
        float gstP = 18.00F;
        int Finalprice = pri + (int)gstP;
        System.out.println(Finalprice);
    }
}
