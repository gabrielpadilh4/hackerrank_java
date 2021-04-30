package com.github.gabrielpadilh4.problem.challenges;

import java.util.ArrayList;
import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/java-arraylist/problem
 */
public class JavaArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<int[]> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();

            String[] elements = input.split(" ");

            int lineNumbersCount = Integer.parseInt(elements[0]);

            int[] lineNumbers = new int[lineNumbersCount];

            for (int j = 1; j <= lineNumbersCount; j++) {
                lineNumbers[j - 1] = Integer.parseInt(elements[j]);
            }

            numbers.add(lineNumbers);

        }

        int queries = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < queries; i++) {
            String input = sc.nextLine();

            String[] positions = input.split(" ");

            int x = Integer.parseInt(positions[0]) - 1;

            int y = Integer.parseInt(positions[1]);

            int[] numberArr = numbers.get(x);

            try {
                System.out.println(numberArr[y - 1]);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }

        sc.close();

    }
}
