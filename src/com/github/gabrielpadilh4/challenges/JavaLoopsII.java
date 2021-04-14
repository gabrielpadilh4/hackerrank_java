package com.github.gabrielpadilh4.challenges;

import java.util.Arrays;
import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/java-loops/problem
 */
public class JavaLoopsII {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            double[] series = new double[n];

            for (int s = 0; s < series.length; s++) {
                if (s == 0) {
                    series[s] = a + Math.pow(2, s) * b;
                    System.out.printf("%.0f ", series[s]);
                    continue;
                }

                series[s] = series[s - 1] + (Math.pow(2, s) * b);

                System.out.printf("%.0f ", series[s]);

            }

            System.out.println();

        }
        in.close();
    }
}
