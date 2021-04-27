package com.github.gabrielpadilh4.problem.java_bignumber;

import java.math.BigDecimal;
import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/java-bigdecimal/problem
 */
public class JavaBigDecimal {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < s.length - 2; i++) {

            for (int j = 1; j < (n - i); j++) {

                BigDecimal current = new BigDecimal(s[j]);

                BigDecimal previous = new BigDecimal(s[j - 1]);

                if (current.compareTo(previous) == 1) {

                    String temp = s[j];

                    s[j] = s[j - 1];
                    s[j - 1] = temp;

                }
            }
        }


        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
