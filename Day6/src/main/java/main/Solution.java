/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Elvin
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            char[] c=s.toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(c[j]);;
                }
            }
            System.out.print(" ");
            for (int j = 0; j < c.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(c[j]);;
                }
            }
            System.out.println("");
            
        }

    }
}
