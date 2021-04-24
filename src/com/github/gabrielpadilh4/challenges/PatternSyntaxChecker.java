package com.github.gabrielpadilh4.challenges;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/*
    https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
 */
public class PatternSyntaxChecker {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            String pattern = in.nextLine();
            //Write your code

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
                testCases--;
            } catch (PatternSyntaxException e) {
                testCases--;
                System.out.println("Invalid");
            }
        }

    }
}
