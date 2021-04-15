package com.github.gabrielpadilh4.challenges;

import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/java-datatypes/problem
 */
public class JavaDataTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");

                // Solution
                if (x >= -32768 && x <= 32767) System.out.println("* short");
                if (x >= Math.pow(-2, 31) - 1 && x <= Math.pow(2, 31) - 1) System.out.println("* int");
                if (x >= Math.pow(-2, 63) - 1 && x <= Math.pow(2, 63) - 1) System.out.println("* long");
                // end solution

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
