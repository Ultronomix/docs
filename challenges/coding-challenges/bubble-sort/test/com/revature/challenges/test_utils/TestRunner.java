package com.revature.challenges.test_utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class TestRunner {

    public static void main(String[] args) {
        System.out.println("Running tests...");
        int passed = 0, failed = 0, error = 0;

        try {
            Class<?> testSuiteClass = Class.forName("com.revature.challenges.bubble_sort.NumericBubbleSorterTest");

            if (!testSuiteClass.isAnnotationPresent(Describe.class)) {
                throw new RuntimeException("Test suite classes are expected to be annotated with @Describe!");
            }

            List<Method> testMethods = new LinkedList<>();
            Method beforeEachMethod = null;

            for (Method classMethod : testSuiteClass.getDeclaredMethods()) {

                if (classMethod.isAnnotationPresent(Test.class)) {
                    testMethods.add(classMethod);
                }

                if (classMethod.isAnnotationPresent(BeforeEach.class)) {
                    if (beforeEachMethod != null) {
                        throw new RuntimeException("Only expected one @BeforeEach method!");
                    }
                    beforeEachMethod = classMethod;
                }

            }

            Object testSuiteInstance = testSuiteClass.newInstance();
            for (Method testMethod : testMethods) {
                try {
                    if (beforeEachMethod != null) beforeEachMethod.invoke(testSuiteInstance);
                    testMethod.invoke(testSuiteInstance);
                    System.out.printf("\u001B[32m" + "Passed %s", testMethod.getName() + "\u001B[0m\n");
                    passed++;
                } catch (InvocationTargetException e) {
                    System.err.println(e.getCause().getMessage());
                    failed++;
                } catch (Throwable t) {
                    error++;
                }
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.printf("Passed: %d, Failed: %d, Error: %d\n", passed, failed, error);

    }

}
