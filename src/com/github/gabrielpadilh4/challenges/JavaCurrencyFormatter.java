package com.github.gabrielpadilh4.challenges;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/java-currency-formatter/problem
 */
public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // India
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        String indiaMoneyString = formatter.format(payment);

        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + indiaMoneyString);
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));

    }
}
