/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.day9;

/**
 *
 * @author Elvin
 */
import java.util.*;

public class Solution {

    public static int factorial(int n) {
        // Write your code here
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        try {
            Integer i = Integer.parseInt(s);
            System.out.println(factorial(i));
        } catch (Exception ex) {
            System.out.println("0");
        }

    }
}
