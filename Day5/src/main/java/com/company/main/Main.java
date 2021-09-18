/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Elvin
 */
public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        for (int i = 1; i < 11; i++) {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
    }
}
