package com.github.gabrielpadilh4.challenges;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    hackerrank.com/challenges/tag-content-extractor/problem
 */
public class TagContentExtractor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(line);

            boolean isMatch = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                isMatch = true;
            }

            if (!isMatch) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}
