package com.revature.demos;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ReflectiveJava {

    public static void main(String[] args) {

        inspectClass(User.class);

    }

    // <?> = generic wildcare, could be anything
    public static void inspectClass(Class<?> clazz) {
        listPublicConstructors(clazz);
        listPublicFields(clazz);
        getNonPublicFields(clazz);
    }

    public static void listPublicConstructors(Class<?> clazz) {

        System.out.println("Printing the public constructors for: " + clazz.getName());
        Constructor<?>[] classConstructors = clazz.getConstructors();
        for (Constructor<?> constructor : classConstructors) {
            System.out.println("\tConstructor name: " + constructor.getName());
            System.out.println("\tConstructor parameters: " + Arrays.toString(constructor.getParameters()) + "\n");
        }
    }

    public static void listPublicFields(Class<?> clazz) {
        System.out.println("Printing the public fields for: " + clazz.getName());
        Field[] fields = clazz.getFields();
        if (fields.length == 0) {
            System.out.println("\tThere are no public fields in " + clazz.getName());
        } else {
            for (Field field : fields) {
                System.out.println("\tField name: " + field.getName());
                System.out.println("\tField type: " + field.getType());
                System.out.println("\tIs primitive: " + field.getType().isPrimitive());
                System.out.println("\tModifiers bit value: " + Integer.toBinaryString(field.getModifiers()) + "\n");
            }
        }
    }

    public static void getNonPublicFields(Class<?> clazz) {
        System.out.println("Printing the declared non-public fields for: " + clazz.getName());
        Field[] fields = clazz.getDeclaredFields();
        if (fields.length == 0) {
            System.out.println("\tThere are no declared fields in " + clazz.getName());
        } else {
            for (Field field : fields) {
                if ((field.getModifiers() & Modifier.PUBLIC) != Modifier.PUBLIC) {
                    System.out.println("\tField name: " + field.getName());
                    System.out.println("\tField type: " + field.getType());
                    System.out.println("\tIs primitive: " + field.getType().isPrimitive());
                    System.out.println("\tModifiers bit value: " + (field.getModifiers()) + "\n");
                }
            }
        }
    }

}
