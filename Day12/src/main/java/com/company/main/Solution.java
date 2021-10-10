/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main;

/**
 *
 * @author Elvin
 */
import java.util.*;

class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                + "\nID: " + idNumber);
    }

}

class Student extends Person {

    private int[] testScores;

    public char calculate() {
        double sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        double result = sum / testScores.length;
        if (result >= 90 && result <= 100) {
            return 'O';
        } else if (result >= 80 && result < 90) {
            return 'E';
        } else if (result >= 70 && result < 80) {
            return 'A';
        } else if (result >= 55 && result < 70) {
            return 'P';
        } else if (result >= 40 && result < 55) {
            return 'D';
        } else {
            return 'T';
        }

    }

    public Student(String firstName, String lastName, int identification, int[] score) {
        super(firstName, lastName, identification);
        this.testScores = score;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
