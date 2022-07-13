package com.Arrays.Rearrange;

import java.util.Arrays;

public class RearrangeMaxMin {

    public static void main(String[] args)
    {
        long arr[] = new long[] { 1, 2, 3, 4, 5, 6 };
        System.out.println("Original Array " + Arrays.toString(arr));
        rearrange(arr, arr.length);
        System.out.println("Modified Array " + Arrays.toString(arr) + "\n");

        long arr1[] = new long[] { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Original Array " + Arrays.toString(arr1));
        rearrange(arr1, arr1.length);
        System.out.println("Modified Array " + Arrays.toString(arr1));
    }

    private static void rearrange(long[] arr, int n) {

        long[] tempArray = Arrays.copyOf(arr, n);
        int index = n-1;

        for (int i = 0; i < n; i = i+2){
            arr[i] = tempArray[index];
            index--;
        }

        index = 0;
        for (int j = 1; j < n; j = j+2){
            arr[j] = tempArray[index];
            index++;
        }
    }
}
