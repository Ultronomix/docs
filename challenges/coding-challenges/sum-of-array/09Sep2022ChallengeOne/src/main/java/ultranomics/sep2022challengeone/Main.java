package ultranomics.sep2022challengeone;

import java.util.Scanner;
import static ultranomics.sep2022challengeone.LengthOfString.lengthOfString;
import static ultranomics.sep2022challengeone.SumOfArray.sumOfArray;

public class Main {
//    Sum of Array
//        1. create the class SumOfArray
//        2. create an array if integers [1,2,3,4,5]
//        3. print out the sum of the array
    
//    Length of String
//        1. create the class LengthOfString
//        2. take in a user input string
//        3. if the string is more than 10 characters, abbreviate the string: internationalization -> i18n
//        4. if the string is less than 10 characters, print out the string
    public static void main(String[] args){
    
    
    
        int[] intArray = new int[]{1,2,3,4,5};

        System.out.println("The sum of the array is: " + sumOfArray(intArray));

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string below");
        String userString = input.nextLine();
        
        String transformUserString = lengthOfString(userString);
        
        System.out.println("Your original string: "+ userString);
        System.out.println("Your transformed string: "+ transformUserString);
    }
}
