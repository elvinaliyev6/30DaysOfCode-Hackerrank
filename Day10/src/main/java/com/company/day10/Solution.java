/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.day10;

import java.util.Scanner;

/**
 *
 * @author Elvin
 */
// Java Program to Convert Integer Values into Binary
// Importing CLasses/Files
import java.io.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int count = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            } else {
                count = 0;
            }
            if (max < count) {
                max = count;
            }
            n = n / 2;
        }
        System.out.println(max);

    }
}
