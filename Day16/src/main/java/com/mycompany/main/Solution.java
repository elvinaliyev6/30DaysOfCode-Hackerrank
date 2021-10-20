/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        try{
            Integer number=Integer.parseInt(s);
            System.out.println(number);
        }catch(Exception ex){
            System.out.println("Bad String");
        }
    }
}
