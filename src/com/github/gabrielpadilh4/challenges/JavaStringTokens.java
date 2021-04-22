package com.github.gabrielpadilh4.challenges;

import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/java-string-tokens/problem
 */
public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        s = s.trim();

        if (s.length() > 0) {

            String[] tokens = s.split("[!,?.*_'@\\ ]+");

            System.out.println(tokens.length);

            for (String token : tokens
            ) {
                System.out.println(token);
            }

        } else {
            System.out.println(0);
        }

        scan.close();
    }
}
