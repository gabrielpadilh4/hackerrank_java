package com.github.gabrielpadilh4.challenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/java-string-compare/problem
 */
public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + k > s.length()) break;
            counter++;
        }

        String[] substrings = new String[counter];

        for (int i = 0; i < s.length(); i++) {
            if (i + k > s.length()) break;
            substrings[i] = s.substring(i, i + k);
        }

        for (int i = 0; i < counter - 1; i++) {
            for (int j = i + 1; j < substrings.length; j++) {
                //compares each elements of the array to all the remaining elements
                if (substrings[i].compareTo(substrings[j]) > 0) {
                    //swapping array elements
                    String temp = substrings[i];
                    substrings[i] = substrings[j];
                    substrings[j] = temp;
                }
            }
        }

        smallest = substrings[0];
        largest = substrings[substrings.length -1];


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
