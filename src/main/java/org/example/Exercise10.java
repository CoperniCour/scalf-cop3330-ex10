/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 10 - Self-Checkout

package org.example;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        //Get 3 items prices and quantities

        //Item 1
        Scanner getNumbers = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        String item1 = getNumbers.nextLine();
        Integer price_item1=Integer.parseInt(item1);
        System.out.print("Enter the quantity of item 1: ");
        String num_item1 = getNumbers.nextLine();
        Integer quan_item1=Integer.parseInt(num_item1);

        //Item 2
        System.out.print("Enter the price of item 2: ");
        String item2 = getNumbers.nextLine();
        Integer price_item2=Integer.parseInt(item2);
        System.out.print("Enter the quantity of item 2: ");
        String num_item2 = getNumbers.nextLine();
        Integer quan_item2=Integer.parseInt(num_item2);

        //Item 3
        System.out.print("Enter the price of item 3: ");
        String item3 = getNumbers.nextLine();
        Integer price_item3=Integer.parseInt(item3);
        System.out.print("Enter the quantity of item 3: ");
        String num_item3 = getNumbers.nextLine();
        Integer quan_item3=Integer.parseInt(num_item3);

        //Calc total cost of each item, subtotal, tax, and total cost
        //Print all out

        double total_price_item1 = price_item1 * quan_item1;
        double total_price_item2 = price_item2 * quan_item2;
        double total_price_item3 = price_item3 * quan_item3;
        double subtotal = total_price_item1 + total_price_item2 + total_price_item3;
        double tax = subtotal*0.055;
        double total_cost = subtotal + tax;
        System.out.println(String.format("Subtotal: $%.02f", subtotal));
        System.out.println(String.format("Tax: $%.02f", tax));
        System.out.println(String.format("Total: $%.02f", total_cost));
    }
}
