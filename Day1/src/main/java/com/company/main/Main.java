/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main;

import java.util.Scanner;

/**
 *
 * @author Elvin
 */
public class Main {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        Scanner scan=new Scanner(System.in);
        int i2=scan.nextInt();
        double d2=scan.nextDouble();
        scan.nextLine();
        String s2=scan.nextLine();
        
        System.out.println(i+i2);
        System.out.println(d2+d);
        System.out.println(s+s2);
        scan.close();
    }
}
