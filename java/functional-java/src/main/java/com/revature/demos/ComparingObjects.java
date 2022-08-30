package com.revature.demos;

import java.util.*;

public class ComparingObjects {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Bob", "Davis", 32));
        people.add(new Person("Ethel", "Jackson", 63));
        people.add(new Person("Travis", "Barker", 43));
        people.add(new Person("Wezley", "Singleton", 32));
        people.add(new Person("Nicole", "Edwards", 33));

        System.out.println(people);

        // Comparator (separate reference)
//        people.sort(new PersonComparer());

        // Comparator (local anon class implementation; pre Java 8)
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() < o2.getAge()) {
                    return -1;
                } else if (o1.getAge() > o2.getAge()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        // Comparator (lambda expression)
        // Lambda expressions are the inline implementation of a functional interface's ONE ABSTRACT METHOD
        people.sort((o1, o2) -> {
            if (o1.getAge() < o2.getAge()) {
                return -1;
            } else if (o1.getAge() > o2.getAge()) {
                return 1;
            } else {
                return 0;
            }
        });

        // Comparator (even more concise using the Comparator static utility methods)
        people.sort(Comparator.comparingInt(Person::getAge)); // Person::getAge is a method reference


        System.out.println("+-------------------------------------+");
        System.out.println(people);


    }

}
