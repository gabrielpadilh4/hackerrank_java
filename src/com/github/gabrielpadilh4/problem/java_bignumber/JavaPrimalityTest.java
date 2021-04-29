package com.github.gabrielpadilh4.problem.java_bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/java-primality-test/problem
 */
public class JavaPrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String n = scanner.nextLine();

        BigInteger number = new BigInteger(n);

        if(number.isProbablePrime(1)){
            System.out.println("prime");
        } else{
            System.out.println("not prime");
        }

        scanner.close();

    }
}
