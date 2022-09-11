package LengthOfString;

import java.util.Scanner;

public class LengthOfString {
    // Function to convert the given string into its abbreviation
    static void abbreviateType(String string) {

        // Stores the length of the string
        int length = string.length();


        if (length > 10) {
            // prints the 1st char
            System.out.print(string.charAt(0));

            // prints 2 in-between char
            System.out.print(length - 2);

            // prints last char
            System.out.print(string.charAt(length - 1));

        } else {
            // prints equal or less than 10 characters
            System.out.println("Your word you typed " + "'" + string + "'" + " was less than 10 letters: ");

        }

    }

    // Driver Code
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word greater than 10 letters: ");
        String str = input.nextLine();
        System.out.println("This is the word you typed " + "'" + str + "'" + "," + " and it has the following abbreviation: ");
        abbreviateType(str);

    }
}
