/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.day8;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Elvin
 */
public class Main {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            String key = arr[0];
            String value = arr[1];
            map.put(key, value);
        }
        while(sc.hasNext()){
            String word=sc.nextLine();
            if(map.containsKey(word)){
                System.out.println(word+"="+map.get(word));
            }else{
                System.out.println("Not found");
            }
        }

    }
}
