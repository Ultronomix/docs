package com.revature.challenges.bubble_sort;

public class NumericBubbleSorter implements Sorter<Integer> {

    /**
     * Sorts the provided collection of Integers from smallest to largest using the bubble
     * sort algorithm.
     *
     * This method is considered to be impure, as it will modify the provided array directly.
     *
     * @param collection the array to be sorted
     * @throws IllegalArgumentException if a null array is provided
     */

    int j;
    int i;
    @Override
    public void sort(Integer[] collection) throws IllegalArgumentException, NullPointerException {
        
                if (collection == null) {
                    throw new NullPointerException();
                } else {
                    int n = collection.length;
                    for (int i = 0; i < n - 1; i++)
                        for (int j = 0; j < n - 1; j++)
                            if (collection[j] > collection[j + 1]) {
                                int temp = collection[j];
                                collection[j] = collection[j + 1];
                                collection[j + 1] = temp;
                            }
                }    
            
        

        
    }


}
