package com.revature.jankunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JankUnit {

    public static void main(String[] args) {

        System.out.println("Running tests...");

        class Score {
            int passed;
            int failed;
        }

        final Score testScore = new Score();

        try {
            Class<?> testSuiteClass = Class.forName("com.revature.jankunit.CalculatorTestSuite");
            List<Method> testMethods = Arrays.stream(testSuiteClass.getMethods())
                                             .filter(method -> method.isAnnotationPresent(Test.class))
                                             .collect(Collectors.toList());

            System.out.println("Number of tests to run: " + testMethods.size());

            testMethods.forEach(method -> {
                try {
                    method.invoke(testSuiteClass.newInstance());
                    testScore.passed++;
                } catch (InvocationTargetException | AssertionException e) {
                    testScore.failed++;
                } catch (IllegalAccessException | InstantiationException e) {
                    throw new RuntimeException(e);
                }
            });

        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load class, nested message is: " + e.getMessage());
        }

        System.out.printf("Passed: %d, Failed: %d", testScore.passed, testScore.failed);


    }

}
