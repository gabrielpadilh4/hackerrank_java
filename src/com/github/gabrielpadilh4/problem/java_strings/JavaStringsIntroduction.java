package com.github.gabrielpadilh4.problem.java_strings;

import java.util.Locale;
import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/java-strings-introduction/problem
 */
public class JavaStringsIntroduction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        // 1. Sum the lengths of A and B
        int lengths = A.length() + B.length();
        System.out.println(lengths);

        // 2. Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
        System.out.println(A.compareTo(B) >= 1 ? "Yes" : "No");

        // 3. Capitalize the first letter in  and  and print them on a single line, separated by a space.
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(capitalizedA + " " + capitalizedB);
    }
}
