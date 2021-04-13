package com.github.gabrielpadilh4.challenges;

import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/java-output-formatting/problem
 */
public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //Complete this line
            System.out.printf("%-15s",s1);
            System.out.printf("%03d",x);
            System.out.println();
        }
        System.out.println("================================");
    }
}
