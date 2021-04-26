package com.github.gabrielpadilh4.problem.java_strings;

import java.util.Scanner;

/*
    https://www.hackerrank.com/challenges/java-regex/problem?h_r=next-challenge&h_v=zen
 */
public class JavaRegex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {

    String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

}
