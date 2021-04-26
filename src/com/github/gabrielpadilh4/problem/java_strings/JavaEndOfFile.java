package com.github.gabrielpadilh4.problem.java_strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/java-end-of-file/problem
 */
public class JavaEndOfFile {
    public static void main(String[] args) {

        // Solution
        Scanner in = new Scanner(System.in);

        int lineNumber = 0;
        boolean hasNext;

        HashMap<Integer, String> lines = new HashMap<>();

        do {

            hasNext = in.hasNext();

            if (hasNext) {
                lineNumber++;

                lines.put(lineNumber, in.nextLine());

            } else {
                break;
            }

        } while (hasNext);

        in.close();

        for (Map.Entry<Integer, String> line : lines.entrySet()
        ) {
            System.out.printf("%d %s%n", line.getKey(), line.getValue());
        }

        // end solution
    }
}
