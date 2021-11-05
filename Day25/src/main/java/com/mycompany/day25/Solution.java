/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.day25;

import java.util.Scanner;

/**
 *
 * @author Elvin Aliyev
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();

            String result=isPrime(number);
            System.out.println(result);
        }
    }

    public static String isPrime(int number) {
        
        if(number==1)
            return "Not prime";
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "Not prime";
            }
        }
        return "Prime";
    }

}

