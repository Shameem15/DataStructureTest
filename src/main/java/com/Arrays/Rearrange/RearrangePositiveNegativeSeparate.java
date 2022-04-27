package com.Arrays.Rearrange;

import java.util.Arrays;

public class RearrangePositiveNegativeSeparate {

    public static void main (String[] args)
    {
        int arr[] = {12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = arr.length;
        rearrange(arr, n);
        System.out.println("Array after rearranging: " + Arrays.toString(arr));

        int arr1[] = {5, 5, -3, 4, -8, 0, -7, 3, -9, -3, 9, -2, 1};
        int n1 = arr1.length;
        rearrange(arr1, n1);
        System.out.println("Array after rearranging: " + Arrays.toString(arr1));

        long arr2[] = {5, 5, -3, 4, -8, 0, -7, 3, -9, -3, 9, -2, 1};
        long n2 = arr2.length;
        rearrangeLong(arr2, n2);
        System.out.println("Array after rearranging: " + Arrays.toString(arr2));
    }

    private static void rearrangeLong(long[] arr, long n) {

        int countNeg = 0 , countPos = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] >= 0){
                countPos++;
            } else {
                countNeg++;
            }
        }

        long[] neg = new long[countNeg];
        long[] pos = new long[countPos];

        int indexPos = 0, indexNeg = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] >= 0){
                pos[indexPos] = arr[i];
                indexPos++;
            } else {
                neg[indexNeg] = arr[i];
                indexNeg++;
            }
        }

        for(int i = 0; i < n; i++) {

            if (i < indexNeg) {
                arr[i] = neg[i];
            }

            if (i >= indexNeg) {
                arr[i] = pos[i-indexNeg];
            }
        }
    }

    private static void rearrange(int[] arr, int n) {
        int countNeg = 0 , countPos = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] >= 0){
                countPos++;
            } else {
                countNeg++;
            }
        }

        int[] neg = new int[countNeg];
        int[] pos = new int[countPos];

        int indexPos = 0, indexNeg = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] >= 0){
                pos[indexPos] = arr[i];
                indexPos++;
            } else {
                neg[indexNeg] = arr[i];
                indexNeg++;
            }
        }

        for(int i = 0; i < n; i++) {

            if (i < indexNeg) {
                arr[i] = neg[i];
            }

            if (i >= indexNeg) {
                arr[i] = pos[i-indexNeg];
            }
        }

    }
}
