package com.revature.challenges.finding_cycles;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SinglyLinkedListTest {

    private SinglyLinkedList<String> sut;

    @Test
    public void test_containsCycle_returnsTrue_givenThatTailReferencesHead() {

        // Arrange: Node creation
        SinglyLinkedList.Node<String> testHead = new SinglyLinkedList.Node<>("test-data-0");
        SinglyLinkedList.Node<String> node1 = new SinglyLinkedList.Node<>("test-data-1");
        SinglyLinkedList.Node<String> node2 = new SinglyLinkedList.Node<>("test-data-2");
        SinglyLinkedList.Node<String> node3 = new SinglyLinkedList.Node<>("test-data-3");
        SinglyLinkedList.Node<String> node4 = new SinglyLinkedList.Node<>("test-data-4");
        SinglyLinkedList.Node<String> node5 = new SinglyLinkedList.Node<>("test-data-5");
        SinglyLinkedList.Node<String> node6 = new SinglyLinkedList.Node<>("test-data-6");

        // Arrange: Node linking
        testHead.nextNode = node1;
        node1.nextNode = node2;
        node2.nextNode = node3;
        node3.nextNode = node4;
        node4.nextNode = node5;
        node5.nextNode = node6;
        node6.nextNode = testHead;

        // Arrange: Node instantiation
        sut = new SinglyLinkedList<>(testHead);

        // Act
        boolean containsCycleResult = sut.containsCycle();

        // Assert
        assertTrue(containsCycleResult);

    }

    @Test
    public void test_containsCycle_returnsTrue_givenThatTailContainsInnerCycle() {

        // Arrange: Node creation
        SinglyLinkedList.Node<String> testHead = new SinglyLinkedList.Node<>("test-data-0");
        SinglyLinkedList.Node<String> node1 = new SinglyLinkedList.Node<>("test-data-1");
        SinglyLinkedList.Node<String> node2 = new SinglyLinkedList.Node<>("test-data-2");
        SinglyLinkedList.Node<String> node3 = new SinglyLinkedList.Node<>("test-data-3");
        SinglyLinkedList.Node<String> node4 = new SinglyLinkedList.Node<>("test-data-4");
        SinglyLinkedList.Node<String> node5 = new SinglyLinkedList.Node<>("test-data-5");
        SinglyLinkedList.Node<String> node6 = new SinglyLinkedList.Node<>("test-data-6");

        // Arrange: Node linking
        testHead.nextNode = node1;
        node1.nextNode = node2;
        node2.nextNode = node3;
        node3.nextNode = node4;
        node4.nextNode = node5;
        node5.nextNode = node6;
        node6.nextNode = node3;

        // Arrange: List instantiation
        sut = new SinglyLinkedList<>(testHead);

        // Act
        boolean containsCycleResult = sut.containsCycle();

        // Assert
        assertTrue(containsCycleResult);

    }

    @Test
    public void test_containsCycle_returnsFalse_givenThatListDoesNotContainsCycle() {

        // Arrange: Node creation
        SinglyLinkedList.Node<String> testHead = new SinglyLinkedList.Node<>("test-data-0");
        SinglyLinkedList.Node<String> node1 = new SinglyLinkedList.Node<>("test-data-1");
        SinglyLinkedList.Node<String> node2 = new SinglyLinkedList.Node<>("test-data-2");
        SinglyLinkedList.Node<String> node3 = new SinglyLinkedList.Node<>("test-data-3");
        SinglyLinkedList.Node<String> node4 = new SinglyLinkedList.Node<>("test-data-4");
        SinglyLinkedList.Node<String> node5 = new SinglyLinkedList.Node<>("test-data-5");
        SinglyLinkedList.Node<String> node6 = new SinglyLinkedList.Node<>("test-data-6");

        // Arrange: Node linking
        testHead.nextNode = node1;
        node1.nextNode = node2;
        node2.nextNode = node3;
        node3.nextNode = node4;
        node4.nextNode = node5;
        node5.nextNode = node6;
        node6.nextNode = null;

        // Arrange: List instantiation
        sut = new SinglyLinkedList<>(testHead);

        // Act
        boolean containsCycleResult = sut.containsCycle();

        // Assert
        assertFalse(containsCycleResult);
    }

    @Test
    public void test_containsCycle_returnsFalse_givenThatListIsEmpty() {
        sut = new SinglyLinkedList<>(null);
        assertFalse(sut.containsCycle());
    }

}
