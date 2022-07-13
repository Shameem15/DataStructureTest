package com.Arrays.Rearrange;

import java.util.Arrays;
/*
* Rearrange an array such that ‘arr[j]’ becomes ‘i’ if ‘arr[i]’ is ‘j’
* */
public class RearrangeArray2 {
    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 0, 2 };
        int n = arr.length;

        System.out.println("Given array is " + Arrays.toString(arr));
        rearrangeNaive(arr, n);
        System.out.println("Modified array is " + Arrays.toString(arr) + "\n");

        int arr1[] = { 2, 0, 1, 4, 5, 3 };
        int n1 = arr1.length;

        System.out.println("Given array is " + Arrays.toString(arr1));
        rearrangeNaive(arr1, n1);
        System.out.println("Modified array is " + Arrays.toString(arr1));

    }

    private static void rearrangeNaive(int[] arr, int n) {
        int[] tempArray = Arrays.copyOf(arr, n);

        for (int i = 0; i < n; i++) {
            arr[tempArray[i]] = i;
        }
    }
}
