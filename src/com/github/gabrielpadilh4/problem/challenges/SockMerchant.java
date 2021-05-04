package com.github.gabrielpadilh4.problem.challenges;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class SockMerchant {

    public static int sockMerchant(int n, List<Integer> ar) {

        HashMap<Integer,Integer> frequencymap = new HashMap<Integer,Integer>();

        int pairs = 0;

        for(int i: ar){
            frequencymap.put(i, Collections.frequency(ar, i));
        }

        for(Integer i: frequencymap.keySet()){

            if(frequencymap.get(i) % 2 == 0){
                pairs += frequencymap.get(i) / 2;
            } else {
                if((frequencymap.get(i) - 1) % 2 == 0){
                    pairs += (frequencymap.get(i) - 1) / 2;
                }
            }

        }

        return pairs;

    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int result = SockMerchant.sockMerchant(n, ar);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
