package com.github.gabrielpadilh4.problem.java_strings;

import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/java-string-reverse/problem
 */
public class JavaStringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        String reverse = new StringBuilder(A).reverse().toString();

        if(reverse.equals(A)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
