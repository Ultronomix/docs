package com.revature;

import java.util.Arrays;

public class Student implements Comparable<Student>{

    private String firstName;
    private String lastName;
    private String[] classes;
    private double gpa;

    public Student(String firstName, String lastName, String[] classes, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classes = classes;
        this.gpa = gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classes=" + Arrays.toString(classes) +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.gpa > o.getGpa()){
            return 1;
        } else if( this.gpa < o.gpa){
            return -1;
        } else{
            return 0;
        }
    }
}
