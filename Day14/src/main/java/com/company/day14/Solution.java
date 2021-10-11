/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.day14;

/**
 *
 * @author Elvin
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

    public Difference(int[] elements) {
        this.elements=elements;
    }
    
    public int computeDifference(){
         maximumDifference=Math.abs(elements[0]-elements[1]);
        for (int i = 0; i < elements.length-1; i++) {
            for (int j = i+1; j < elements.length; j++) {
                if(maximumDifference<Math.abs(elements[i]-elements[j]))
                    maximumDifference=Math.abs(elements[i]-elements[j]);
            }
        }
        return maximumDifference;
    }
        
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
