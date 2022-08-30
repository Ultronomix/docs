package com.revature;


// We're going to utilize Generics to make it possible for us to store ANY type opf data in our generic linked list,
// However, once we declare whatver type of data we want to use, we cannot change it.
public class GenericLinkedList<T> {

    // LinkedLists only needs some basic information about a head node and the number of nodes we have
    public int length;

    // We'll create a custom node type to hold our data
    // We need specific information about the head or starting point of our list
    private Node<T> head;

    // Let's create a constructor
    public GenericLinkedList(){
        this.length = 0;
        head = null;
    }

    // The most basic of linked lists need the following methods
    // add, remove and get specific pieces of data

    public void add(T data){
        // We need to create a node of the data
        Node<T> node = new Node<T>(data);

        // We have a couple cases we need to check for before directly adding it to the list
        // First we need to check if the list is empty, if it is we need to set the head to the node we just created
        if (this.head == null){
            this.head = node;
            return;
        } else {
            // Otherwise we want to loop through the list looking for the last node
            // The last node in the list is the one that has node "next" node so when we see a node with the next value
            // = null we know we have made it to the end
            Node<T> n = this.head;
            while (n.getNext() != null){
                n = n.getNext();
            }
            // To add the node to the list we simply set the next variable of the last element to the node we want
            // to add
            n.setNext(node);
        }

        // Finally we need to keep track of the length of the list so we'll update that
        length++;
    }

    // Remove method is a little trickier to understand conceptually but we should be able to just mess around with
    // pointers and be fine
    public void remove(int index){
        // We have a couple use cases to be aware of
        // The first is if the element we want to delete is the head node
        // We simply set the head to the next element
        if (index == 0){
            head = head.getNext();
            length--;
        } else{
            //If the index is between 1 and n-1 where n is the last node in the list, we want to simply point the previous node at the node after the one we want to remove
            //So we want to start at the head and loop until one before the node we want to remove
            //When we get to the index before the one we want to remove, when need to store it in a variable
            //Then we need to move forward two nodes and save that node in a variable
            //Finally we need to point the node from above at the second node from above
            //If the node we want to remove is the final node, next will be equal to null, and we can check for that,
            //If it is the last node, we can just go backwards one node and set next to null

            // Start at the head node
            Node<T> n = head;

            // Loop until we get to index -1 and save it in a variable
            for (int i = 0; i<index-1;i++){
                try{
                    n = n.getNext();
                    if(n.getNext() == null) throw new NullPointerException();
                } catch (NullPointerException e){
                    throw new IndexOutOfBoundsException();
                }
            }

            // Temporarily store the node before the one we are deleting
            Node<T> n1 = n;

            // Get the node following the one we want to delete
            Node<T> n2 = n.getNext().getNext();

            // Now comes the time to check if the node after the one we want is null (meaning we are deleting the last element)
            if (n2==null){
                n1.setNext(null);
            }

            n1.setNext(n2);

            length--;
        }
    }

    // Now that we have add and remove we need to finish out methods and add a get method

    public T get(int index){
        if (index == 0){
            return head.getData();
        } else{
            Node<T> n = head;
            for (int i = 0; i < index;i++){
                // We need to do some final data validation to check if it is out of bounds
                try{
                    n = n.getNext();
                    if(n==null) throw new NullPointerException();
                } catch (NullPointerException e){
                    throw new IndexOutOfBoundsException();
                }
            }
            return n.getData();
        }
    }

    // One final thing I;m going to do is add in a toString method to visually see the state of our list
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Linked List: {\n");
        Node<T> n = head;
        while(n != null){
            sb.append("\t" + n.getData() + ",\n");
            n = n.getNext();
        }
        sb.append("}");
        return sb.toString();
    }
}

class Node<T>{
    // Each node will store some information/data that we are using T as a placeholder for
    // This node can hold ANY data type, though through the use of specific generics we could limit it if we wanted

    // This is the data
    private T data;

    // This is the next node
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
