package com.revature.challenges;

public class MainDriver {
    public static void main(String[] args) {
        /* Use this to populate your Solution class */
        int[] numbers = {1, 3, 5, 6};
        int target = 2;

        Solution solution = new Solution();
        int position = solution.insertPosition(numbers, target);

        System.out.println("Position is: " + position);
    }
}
