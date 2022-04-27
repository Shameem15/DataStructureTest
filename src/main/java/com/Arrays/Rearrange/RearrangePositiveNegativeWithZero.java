package com.Arrays.Rearrange;

import java.util.Arrays;

public class RearrangePositiveNegativeWithZero {

    public static void main (String[] args)
    {
        int arr[] = {12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n = arr.length;
        rearrange(arr, n);
        System.out.println("Array after rearranging: " + Arrays.toString(arr));

        int arr1[] = {-12, 11, 0, -5, 6, -7, 5, -3, -6};
        int n1 = arr1.length;
        rearrange(arr1, n1);
        System.out.println("Array after rearranging: " + Arrays.toString(arr1));

        int arr2[] = {5, 5, -3, 4, -8, 0, -7, 3, -9, -3, 9, -2, 1};
        int n2 = arr2.length;
        rearrange(arr2, n2);
        System.out.println("Array after rearranging: " + Arrays.toString(arr2));
    }

    private static void rearrange(int[] arr, int n) {
        int countNeg = 0 , countPos = 0;
        boolean isZero = false;
        for (int i = 0; i < n; i++) {
            if(arr[i] >= 0){

                if (arr[i] != 0)
                    countPos++;
                else
                    isZero = true;

            } else {
                countNeg++;
            }
        }

        int[] neg = new int[countNeg];
        int[] pos = new int[countPos];

        int indexPos = 0, indexNeg = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] >= 0){
                if (arr[i] != 0) {
                    pos[indexPos] = arr[i];
                    indexPos++;
                }
            } else {
                neg[indexNeg] = arr[i];
                indexNeg++;
            }
        }

        for(int i = 0; i < n; i++) {

            if (i < indexNeg) {
                arr[i] = neg[i];
            }
            if (isZero) {
                arr[indexNeg] = 0;
            }
            if (i > indexNeg) {
                arr[i] = pos[i-indexNeg-1];
            }
        }

    }
}
