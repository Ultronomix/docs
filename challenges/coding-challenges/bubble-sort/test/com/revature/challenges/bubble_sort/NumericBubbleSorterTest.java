package com.revature.challenges.bubble_sort;

import com.revature.challenges.test_utils.AssertionException;
import com.revature.challenges.test_utils.BeforeEach;
import com.revature.challenges.test_utils.Describe;
import com.revature.challenges.test_utils.Test;

import java.util.Arrays;

@Describe
public class NumericBubbleSorterTest {

    private NumericBubbleSorter sut;

    @BeforeEach
    public void setup() {
        sut = new NumericBubbleSorter();
    }

    @Test
    public void test_sort_sortsProvidedArray_givenReverseSortedArray() {

        // Arrange
        Integer[] arrayToBeSorted = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1};
        Integer[] expectedResult = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Act
        sut.sort(arrayToBeSorted);

        // Assert
        if (!Arrays.equals(arrayToBeSorted, expectedResult)) {
            throw new AssertionException("Failed test_sort_sortsProvidedArray_givenReverseSortedArray!");
        }

    }

    @Test
    public void test_sort_sortsProvidedArray_givenRandomlySortedArray() {

        // Arrange
        Integer[] arrayToBeSorted = {9, -1, 8, 0, 7, 1, 6, 2, 5, 3, 4};
        Integer[] expectedResult = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Act
        sut.sort(arrayToBeSorted);

        // Assert
        if (!Arrays.equals(arrayToBeSorted, expectedResult)) {
            throw new AssertionException("Failed test_sort_sortsProvidedArray_givenRandomlySortedArray!");
        }

    }

    @Test
    public void test_sort_sortsProvidedArray_givenSortedArray() {

        // Arrange
        Integer[] arrayToBeSorted = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] expectedResult = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Act
        sut.sort(arrayToBeSorted);

        // Assert
        if (!Arrays.equals(arrayToBeSorted, expectedResult)) {
            throw new AssertionException("Failed test_sort_sortsProvidedArray_givenSortedArray!");
        }

    }

    @Test
    public void test_sort_doesNothing_givenEmptyArray() {

        // Arrange
        Integer[] arr = {};

        // Act
        sut.sort(arr);

        // Assert
        if (!Arrays.equals(arr, new Integer[] {})) {
            throw new AssertionException("Failed test_sort_doesNothing_givenEmptyArray!");
        }

    }

    @Test
    public void test_sort_throwsRuntimeException_givenNullArray() {

        // Act
        try {
            sut.sort(null);
        } catch (IllegalArgumentException e) {
            return;
        }

        throw new AssertionException("Failed test_sort_throwsRuntimeException_givenNullArray!");

    }


}
