package com.revature.challenges.finding_cycles;

public class SinglyLinkedList<T> {

    protected Node<T> head;

    public SinglyLinkedList(Node<T> head) {
        this.head = head;
    }

    /**
     * Determines whether this linked list contains any cycles. A cycle is present if
     * there is any node in the list whose nextNode points to another node present earlier
     * in the list.
     *
     * @return true if a cycle is present within this list, otherwise false
     */
    public boolean containsCycle() {
        // TODO your implementation goes here
        return false;
    }

    public static class Node<T> {
        T data;
        Node<T> nextNode;

        public Node(T data) {
            this.data = data;
        }
    }

}
