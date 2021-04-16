package com.github.gabrielpadilh4.challenges;

import java.util.Scanner;
/*
    https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */
public class JavaStaticInitializerBlock {

    // Solution
    static Scanner in = new Scanner(System.in);
    static int B = in.nextInt();
    static int H = in.nextInt();
    static boolean flag;

    static{

        try {

            if(H <= 0 || B <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }

            flag = true;

            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // end solution

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
