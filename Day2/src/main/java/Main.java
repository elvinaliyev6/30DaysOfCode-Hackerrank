/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elvin
 */
public class Main {

    public static void main(String[] args) {
        solve(12.00, 20, 8);
    }

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = (meal_cost * tip_percent) / 100;
        double tax = (meal_cost * tax_percent) / 100;
        double answer = meal_cost + tip + tax;

        int cost = (int) Math.round(answer);
        System.out.println(cost);
    }

}
