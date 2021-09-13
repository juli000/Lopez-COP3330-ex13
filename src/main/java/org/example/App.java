/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Julio Lopez
 */
package org.example;
import java.text.DecimalFormat;
import java.time.Year;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Enter the principal:" );
        Scanner s = new Scanner(System.in);
        String principal = s.nextLine();
        System.out.println("Enter the rate of interest: ");
        String rate = s.nextLine();
        System.out.println("Enter the number of years: ");
        String years = s.nextLine();
        Double p = Double.valueOf(principal);
        Double r = Double.valueOf(rate);
        Double t = Double.valueOf(years);
        DecimalFormat d = new DecimalFormat("0.00");
        Double a = p * (1 + ((r/100.0)* t));
        System.out.println("After " + years + " years at " + r + "%, the investment will be worth $" + d.format(a) + ".");



    }
}
