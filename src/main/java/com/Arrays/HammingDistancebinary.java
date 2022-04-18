package com.Arrays;

//Hamming distance between two Integers
public class HammingDistancebinary {

    public static void main(String[] args)
    {
        int n1 = 9, n2 = 14;
        System.out.println("hammingDistance: " + hammingDistance(n1, n2));

        System.out.println(Integer.toBinaryString(6) + " " + (6>>1));
    }

    private static int hammingDistance(int n1, int n2) {
        int x = n1 ^ n2;
        int hamCount =0;

        while (x > 0) {
            //hamCount += (x & 1);
            hamCount = hamCount + (x & 1);
            //x>>=1;
            x = (x>>1);
        }
        return hamCount;
    }
}
