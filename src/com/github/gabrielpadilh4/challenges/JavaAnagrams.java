package com.github.gabrielpadilh4.challenges;

import java.util.*;

/*
    https://www.hackerrank.com/challenges/java-anagrams/problem?h_r=next-challenge&h_v=zen
 */
public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {

        a = a.toUpperCase();
        b = b.toUpperCase();

        int counterA = 0;
        int counterB = 0;

        if(a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < a.length(); i++) {

            char c = a.charAt(i);

            for (int j = 0; j < a.length(); j++) {

                if(c == a.charAt(j)){
                    counterA++;
                }

                if(c == b.charAt(j)){
                    counterB++;
                }

            }

            if (counterA != counterB){
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
