package com.revature.recurringWord;

import java.util.ArrayList;

class Solution {

    // ↓ Function to find recurring character *Note* using 'Word'=bad practice/ Not finding recurring word, just character
    // The recurringWord function will print the first repeated character in the string[]
    public static char recurringWord(char string[]) {

        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i <= string.length - 1; i++) {
            char x = string[i];

            if (arrayList.contains(x))
                return x;

            else
                arrayList.add(x);
        }
        return '\0';
    }

}