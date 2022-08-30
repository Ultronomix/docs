package com.revature.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamingCollections {

    public static void main(String[] args) {
        List<Geode> geodes = new ArrayList<>();
        geodes.add(new Geode("Ruby", "Red"));
        geodes.add(new Geode("Sapphire", "Blue"));
        geodes.add(new Geode("Emerald", "Green"));
        geodes.add(new Geode("Diamond", "White"));
        geodes.add(new Geode("Obsidian", "Black"));

        // Old-school imperative logic (focuses more on how to do it)
        List<String> oldWay = new ArrayList<>();
        for (Geode geode : geodes) {
            String geodeName = geode.getName();
            int length = geodeName.length();
            if (geodeName.charAt(length - 1) == 'd') {
                oldWay.add(geodeName);
            }
        }

        // Functional logic (focuses more on what is being done; more abstract)
        List<Geode> geodesThatEndWithD =geodes.stream()
                                              .filter(geode -> endsWithD(geode.getName()))
                                              .collect(Collectors.toList());

        List<String> geodeNamesThatEndWithD =geodes.stream()
                                                   .map(geode -> {
                                                       return geode.getName();
                                                   })
                                                   .filter(geodeName -> {
                                                       return endsWithD(geodeName);
                                                   })
                                                   .collect(Collectors.toList());

        Optional<Geode> optionalGeode = geodes.stream()
                                          .filter(geode -> endsWithZ(geode.getName()))
                                          .findFirst();

        String geodeName = optionalGeode.map(Geode::getName)
                                        .orElse("Nothing");

        System.out.println(geodeName);

        String s = "North";
        String newS = s.concat("west");
        System.out.println(s);
        System.out.println(newS);

        // Main functional operations: filter, map, reduce

        System.out.println(geodes);
        System.out.println("+--------------------+");
        System.out.println(geodesThatEndWithD);
        System.out.println("+--------------------+");
        System.out.println(geodeNamesThatEndWithD);
    }

    public static boolean endsWithD(String s) {
        return s.charAt(s.length() - 1) == 'd';
    }

    public static boolean endsWithZ(String s) {
        return s.charAt(s.length() - 1) == 'z';
    }
}
