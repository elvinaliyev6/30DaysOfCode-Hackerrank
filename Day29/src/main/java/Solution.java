
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Solution{
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for(int a0 = 0; a0 < t; a0++){
        int n = in.nextInt();
        int k = in.nextInt();  
        int finalResult = 0;
        for(int i = 1; i < n ; i++){
            for(int j = i+1; j <= n ; j++){
                int amp = i&j;
                if(amp < k && amp > finalResult)
                    finalResult = amp;                    
            } 
        } 
        System.out.println(finalResult);
    }
}
    
}