package com.revature.challenges.linked_list.test_utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class TestRunner {

    public static void main(String[] args) {

        System.out.println("Running tests...");
        int passed = 0, failed = 0, error = 0;

        try {
            Class<?> testSuiteClass = Class.forName("com.revature.challenges.linked_list.LinkedListTest");

            if (!testSuiteClass.isAnnotationPresent(Describe.class)) {
                throw new RuntimeException("Test suite classes are expected to be annotated with @Describe");
            }


            List<Method> testMethods = new LinkedList<>();
            Method beforeEachMethod = null;

            // class.getMethods vs class.getDeclaredMethods
            // getMethods will return an array containing all methods (even inherited ones)
            // getDeclaredMethods will return an array containing only the explicitly declared ones
            for (Method classMethod : testSuiteClass.getDeclaredMethods()) {

                // Is the method annotated with @Test?
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
                System.out.println("Running test: " + testMethod.getName());
                try {
                    if (beforeEachMethod != null) beforeEachMethod.invoke(testSuiteInstance);
                    testMethod.invoke(testSuiteInstance);
                    passed++;
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
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
