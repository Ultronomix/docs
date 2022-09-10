package com.revature.recurringWordII;

import java.util.Arrays;

public class Solution {
    public String recurringWordII(String str) {
        String[] strArr = str.split(" ");  
        Arrays.sort(strArr);
        
        int max = 0;
        String word = "";
        for (int i = 0; i < strArr.length - 1; i++) {
            int newMax = 0;
            for (int j = 0; j < strArr.length - 1; j++) {
                if (strArr[j].equals(strArr[i])) {
                    newMax++;
                }

                if (newMax > max) {
                    max = newMax;
                    word = strArr[j];
                }
            }
        }

        return word;

    }
}
