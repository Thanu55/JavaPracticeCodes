public class Basics {
    public static void main(String[] args) {

        //first program to just print hello world
        System.out.println("Hello World");

        // Variables
        String name = "Vivek";
        int age = 25;
        // Calling variable within variable
        String boy = name;

        /*Java Data Types
        2 types: Primitive and NonPrimitive /Reference
        - Primitive Types:
        byte -1 [-128 to 127]
        short -2
        int - 4 ex: 2, 3, 4
        long - 8
        float - 4 ex: 3.14
        double - 8
        char - 2 ex: a, b, c, d
        boolean -1 ex: true or false
        - Nonprimitive data type
         The length will be not fixed, where as for the primitive data type it will be.
        */

        // Primitive example
        String personName = name;
        int personAge = age;
        long phoneNo = 919964401233L;
        char initial = 'J';
        float height = 5.80F;

        // NonPrimitive example
        System.out.println(name.length()); //example to show that length is not fixed
        //declare new keyword
        String naam = new String("Thanu");

        // Create two new surname strings
        String sur1 = new String("Tunggu");
        String sur2 = new String("Kumar");
        System.out.println(sur1);
        System.out.println(sur2);

        /* STRINGS
        Various methods & functions used for strings:
        - Concatenate - merge multiple strings
        - CharAt - to find which char is at nth position
        - length - to find the length of the string
        - replace - replace the character in a string ex: Vivek - Givek (V replaced with G)
        - substring - to get certain part of the string ex: string = Thanushree ask for 5,10 the o/p is shree, ask for 3,5 o/p is n
         */

        //Concatenate
        String name1 = "Thanu";
        String name2 = "Shree";
        String name3 = name1 + " " + name2;
        System.out.println(name3); //merged o/p - Thanu Shree

        // CharAt
        name = name;
        System.out.println(name.charAt(0)); //Displays 0th position 'V'

        // length
        name = name;
        System.out.println(name.length()); // Displays the length of the character

        //replace
        name = name;
        String rep = name.replace('V', 'G');
        System.out.println(rep);

        //substring
        String subIt = "Thanushree";
        System.out.println(subIt.substring(3,5)); // usually excludes the last number's value and gives from 1st number (3-4), the count is 0-n

        /* ARRAYS

         */
    }
}


