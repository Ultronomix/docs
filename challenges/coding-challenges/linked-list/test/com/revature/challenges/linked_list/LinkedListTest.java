package com.revature.challenges.linked_list;

import com.revature.challenges.linked_list.test_utils.BeforeEach;
import com.revature.challenges.linked_list.test_utils.Describe;
import com.revature.challenges.linked_list.test_utils.Test;

@Describe
public class LinkedListTest {

    private LinkedList<String> sut;

    @BeforeEach
    public void setup() {
        sut = new LinkedList<>();
    }

    @Test
    public void test_add_insertsNewElementAndIncreasesSize_givenValue() {

        // Arrange
        boolean expectedReturn = true;
        int expectedSize = 1;
        String dataToAdd = "test-data-1";

        // Act
        boolean actualReturn = sut.add(dataToAdd);

        // Assert
        if (actualReturn != expectedReturn) {
            throw new RuntimeException("Test failed! Expected return value to be true!");
        }

        if (sut.size != expectedSize) {
            throw new RuntimeException("Test failed! Expected size of list to be one!");
        }

    }

    @Test
    public void test_add_insertsMultipleElementsAndIncreasesSize_givenMultipleInvocations() {

        // Arrange
        boolean expectedReturn1 = true;
        boolean expectedReturn2 = true;
        boolean expectedReturn3 = true;
        int expectedSize = 3;
        String dataToAdd1 = "test-data-1";
        String dataToAdd2 = "test-data-2";
        String dataToAdd3 = "test-data-3";

        // Act
        boolean actualReturn1 = sut.add(dataToAdd1);
        boolean actualReturn2 = sut.add(dataToAdd2);
        boolean actualReturn3 = sut.add(dataToAdd3);

        // Assert
        if (!actualReturn1 || !actualReturn2 || !actualReturn3) {
            throw new RuntimeException("Test failed! Expected return value to be true!");
        }

        if (sut.size != expectedSize) {
            throw new RuntimeException("Test failed! Expected size of list to be one!");
        }

    }

    @Test
    public void test_containsReturnsTrue_givenValueContainedInList() {

        // Arrange
        sut.add("test-data-1");
        sut.add("test-data-2");
        sut.add("test-data-3");

        // Act
        boolean actualResult1 = sut.contains("test-data-1");
        boolean actualResult2 = sut.contains("test-data-2");
        boolean actualResult3 = sut.contains("test-data-3");

        // Assert
        if (!actualResult1 || !actualResult2 || !actualResult3) {
            throw new RuntimeException("Test failed! Expected return value to be true!");
        }

    }

    @Test
    public void test_containsReturnsFalse_givenValueNotContainedInList() {

        // Arrange
        sut.add("test-data-1");
        sut.add("test-data-2");
        sut.add("test-data-3");

        // Act
        boolean actualResult = sut.contains("test-data-4");

        // Assert
        if (actualResult) {
            throw new RuntimeException("Test failed! Expected return value to be false!");
        }
    }

}
