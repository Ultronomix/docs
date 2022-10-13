import java.util.Arrays;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("(Reverse a String)===========================");

        //This is assuming the interviewer doesn't want you to use a StrinBuilder
        //is you CAN use a StringBuilder, just put the String into a SB and use the .reverse() method

        String s = "Hi I am a String";

        //make an empty String object that will hold the reversed String
        String s2 = "";

        //iterate through the string
        //why minus 1? index 16 does not exist (out of range). we can only access 0-15.
        for(int i = s.length() - 1; i>=0; i--){

            //temporary char to hold whatever char is at index i
            char temp = s.charAt(i);

            s2 += temp; //append whatever char we access to s2
            //by the end of the for loop, s2 will contain a reverse of s
        }

        System.out.println(s); //original String
        System.out.println(s2); //reversed String

        System.out.println("(Detect a Palindrome)=======================");

        //if you can reverse a String, you can pretty easily detect a palindrome
        //a palindrome is a word that's the same forward and backward

        String palindrome = "reviver";
        String tempString = ""; //empty String to hold the reversed String

        //The algorithm for checking for palindromes is just reverse a String with an if statement added
        for(int i = palindrome.length() - 1; i >= 0; i--){
            char temp = palindrome.charAt(i);
            tempString += temp;
        }

        //at the end of the for loop, we have a reverse of the OG String
        //so now we can simply check equality
        if(tempString.equals(palindrome)){
            System.out.println(palindrome + " is a palindrome");
        }

        //----------------------------------------------------------
        //if you are asked if there is a palindrome in a String of words, you'd need to split those words up
        //I would suggest taking that String and using the .split() method to split it by spaces into an Array
        String words = "I am the reviver of cities";

        String[] splitWords = words.split(" ");//split the String by its spaces

        //we would then have a for loop that iterates through this Array
        //and performs the palindrome check on each element

        System.out.println("(Sort an Array)=============================");

        //This can be done with Arrays.sort(), but sometimes interviewers don't let you use that

        //In this case I want to sort least to greatest, you may be asked the opposite
        //for this we'll use the classic "bubble sort", where sorted values "bubble" to the top

        int[] numbers = {1,5,2,3,74,46,357,2,7,15,8};

        //this is going to involve a while loop, holding a for loop, holding an if statement

        //we need a boolean to check if the while loop continues
        boolean numberSwapped = true; //true by default so we actually enter the while loop
        //this will be set to false if no numbers are swapped during a loop (we know the Array is sorted)

        while(numberSwapped){

            numberSwapped = false; //this will go back to true if a number is swapped

            //we need a for loop to iterate through the array
            //why length - 1? because we're only ever going to be comparing two numbers
            //there's no reason to look at the last number alone
            for(int i = 0; i < numbers.length - 1; i++){

                //if the left number is greater than the right number... swap them!
                if(numbers[i] > numbers[i + 1]){
                    //classic coding problem - swap two Array elements
                    //it's very helpful to create a third variable so we don't lose our data
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1]; //the left element is now equal to the right element
                    numbers[i + 1] = temp; //the right element is now equal to what the left element was

                    numberSwapped = true; //to keep the while loop going
                }
            }

        } //end of while loop

        //print out the Array - could have also done a for loop to print them one by one
        System.out.println(Arrays.toString(numbers));

        System.out.println("(Find the nth largest element in an Array)======================");

        //if you can sort an Array, you can very easily find the nth largest/smallest element

        //in order to not rewrite our bubble sort, I'll reuse the already-sorted numbers Array

        //assume you're asked to find the third largest element
        //if it's sorted least to greatest, we need to find the 3rd from last element

        int i = numbers.length - 1; //grabbing the index of the last element. -1 because of zero indexing

        //grabbing the element 2 spaces from the last one
        //(in other words, the third from last element, which should be the third greatest)
        int thirdLargest = numbers[i - 2];

        System.out.println("The third largest number is: " + thirdLargest);

        /*

        Honorable mentions:

        -Sort a String Array alphabetically (you can use > or < just like in an int Array)
        -Find the average length of Strings in an Array (make a new Array of the LENGTHS of each string)
        -Multiply every element in an Array, except for one index (for loop, if statement to check for that index)
        -Write a method to check if a String has vowels (either a switch statement or regex)
        -Find the instances of a certain number in a String (switch as well, and incrementing a counter)

         */

    }

}
