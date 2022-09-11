package com.revature.recurringWord;

import java.util.Scanner;

import static com.revature.recurringWord.Solution.recurringWord;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type your Characters please: ");
        String str = input.nextLine();

        char[] chars = str.toCharArray();

        if (recurringWord(chars) == '\0')
            System.out.println("No Recurring characters");

        else
            System.out.println("The first recurring character is: " + recurringWord(chars));

    }
}