package com.revature;

import java.sql.SQLOutput;
import java.util.*;

public class Driver {

    public static void main(String[] args) {

        GenericLinkedList<String> ll = new GenericLinkedList<>();

        ll.add("hello");
        ll.add("world");
        ll.add("adding");
        ll.add("more");
        ll.add("will");
        ll.add("it");
        ll.add("break?");

        System.out.println(ll.toString());

        // We can also try to remove items
        ll.remove(0);
        ll.remove(3);
        ll.remove(4);

        // We happens if we try to delete a item that is not in the list
        // ll.remove(4);

        System.out.println(ll.toString());

        // We can also use out get method
        System.out.println(ll.get(0));
        System.out.println(ll.get(3));
        // System.out.println(ll.get(4));

        // Additionally we can see the effects of generics by trying to add other data types
        // ll.add(5)

        // If i want to make a list that stored integers I could
        GenericLinkedList<Integer> integerGenericLinkedList = new GenericLinkedList<>();
        integerGenericLinkedList.add(5);
        // integerGenericLinkedList.add("5");

        // Collections API Data Structures

        String classes[] = {"Math", "English", "Science"};

        // Let's construct some students

        Student s1 = new Student("Morty", "Smith", classes, 2.3);
        Student s2 = new Student("Summer", "Smith", classes, 3.0);
        Student s3 = new Student("Tiny", "Rick", classes, 4.0);
        Student s4 = new Student("Jessica", "W", classes, 3.6);

        // So now we can utilize the Collections API to do all the heavy lifting in creating the data structure we want
        // to work with

        // LinkedLists
        // Luckily we don't ACTUALLY have to create these ourselves since Java already created them for us
        List<Student> studentLinkedList = new LinkedList<>();

        // Like our custom created linked list we can add students
        studentLinkedList.add(s1);
        studentLinkedList.add(s2);
        studentLinkedList.add(s3);
        studentLinkedList.add(s4);

        // If we want to loop through our list now, we could use a regular for loop, or we can use an Iterator
        // To get an iterator, you can call LinkedList.iterator()
        Iterator<Student> studentIterator = studentLinkedList.iterator();

        // With our iterator we can loop through linked lists with the .next() method of the iterator
        System.out.println("Looping through our students with an iterator");

        while(studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }

        //There are also many other LinkedList methods you can see by looking here:
        // https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html

        // ArrayLists

        List<Student> studentArrayList = new ArrayList<>();

        // Again ArrayList just like LinkedList has all the functionality you could ever want
        studentArrayList.add(s1);
        studentArrayList.add(s2);
        studentArrayList.add(s3);
        studentArrayList.add(s4);

        System.out.println("===================================");
        System.out.println(studentArrayList.get(2));

        // I mentioned before we can loop this with a for loop as well
        System.out.println("Looping through the ArrayList with a regular ol for loop");

        for (int i = 0; i<studentArrayList.size(); i++){
            System.out.println(studentArrayList.get(i));
        }

        //There are many other ArrayList methods you can see by looking here:
        //https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

        // Sets, in Java you will most likely use a HashSet, TreeSet, or a LinkedHashSet
        // TreeSets are sorted with a comparator, which we'll talk about later on
        // Remember sets won't store duplicates, you can try, but they will not be stored

        Set<Student> studentHashSet = new HashSet<>();

        studentHashSet.add(s1);
        studentHashSet.add(s1);
        studentHashSet.add(s2);
        studentHashSet.add(s3);
        studentHashSet.add(s4);

        System.out.println("Printing our HashSet");
        // We added the same student twice but should only see it once on the results
        for (Student s: studentHashSet){
            System.out.println(s);
        }

        //More methods of the HashSet class can be found here:
        //https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html


        // Queues and Deques
        // Queues are the implementation of the first in first out data structure
        // Deque, is a double ended queue, you can take and add from either the front or the rear

        Deque<Student> studentDeque = new ArrayDeque<>();

        // To add students to the back of the queue
        studentDeque.add(s1);
        studentDeque.add(s2);
        System.out.println("Our Queue");
        System.out.println(studentDeque);

        // We can elements to the front by using push since this is a deque
        studentDeque.push(s3);
        System.out.println(studentDeque);

        // Let's add one more to the front
        studentDeque.push(s4);
        System.out.println(studentDeque);

        // To remove from the front
        Student jessica = studentDeque.remove();
        System.out.println(jessica);
        System.out.println(studentDeque);

        //To remove from the back
        Student summer = studentDeque.removeLast();
        System.out.println(summer);
        System.out.println(studentDeque);

        //For more information about what you can do with the Deque look here:
        //https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html

        // Maps
        // With Maps we store key value pairs
        // The most popular implementation is a HashMap

        //Hashmaps are great for searching for information against the key because they generate
        //a hash based on the value generated from an algorithm when passing that key
        //Then the object gets stored in the corresponding index that equals that hashed value
        //Map<Key,Value>

        Map<String, Student> studentMap = new HashMap<>();

        System.out.println("Playing with Maps");

        // We insert data using .put
        studentMap.put("Tiny Rick", s3);
        studentMap.put("jessica", s4);
        studentMap.put("morty", s1);
        studentMap.put("summer", s2);

        // To search for a value use the .get(key) method
        System.out.println(studentMap.get("summer"));

        System.out.println("=============================");

        //For more information on the HashMap class you can look here:
        //https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html

        // If you remember the maps are not technically part of Collections because they do not implement iterable
        // However you can still iterate throught the values or keys of the map
        Iterator<Student> mapValues = studentMap.values().iterator();

        while(mapValues.hasNext()){
            System.out.println(mapValues.next());
        }

        // The Collections class is a class that holds nice utility method we can use of Collections
        // This includes things like sorting collections
        // However for sorting to work we need to implement the comparable interface
        // We'll implement it to compare students based off GPA
        System.out.println("-----------------------------");
        Collections.sort(studentArrayList);
        System.out.println(studentArrayList);


        //For more information on the Collections class you can look here:
        // https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html


        // We mentioned TreeSets earlier as a set that holds no duplicates but holds the items in sorted order
        // To use a TreeSet we must have a way to compare the items, and treesets use comp[arators
        // To create our own comparator we create a class that implments comparator

        Set<Student> studentTree = new TreeSet<>(new StudentComparator());
        studentTree.add(s1);
        studentTree.add(s2);
        studentTree.add(s3);
        studentTree.add(s4);

        System.out.println("Using a treeset");
        System.out.println(studentTree);
    }
}
