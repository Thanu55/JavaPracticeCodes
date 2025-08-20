package PracticeSetOne;

public class Reverse {
    public static void main(String[] args) {

        // REVERSE A STRING - Using for loop

        String str = "Vivek";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);

        //REVERSE A NUMBER - using a While loop

        int num = 12345;
        int OrigiNum = num;
        int numReversed = 0;

        while (num != 0) {
            int digit = num % 10; //Get last digit
            numReversed = numReversed * 10 + digit; //Append digit (Shift & Add)
            num = num / 10; //Remove last digit
        }

        System.out.println("Original Number: " + OrigiNum);
        System.out.println("Reversed Number: " + numReversed);

    }
}
