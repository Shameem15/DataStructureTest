package com.Arrays.Rearrange;

import java.util.Arrays;
//Move all negative elements to end in order with extra space allowed
public class MoveAllNegToEnd {

    public static void main (String[] args)
    {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        int n = arr.length;
        rearrange(arr, n);
        System.out.println("Array after rearranging: " + Arrays.toString(arr));

        int arr1[] = {-5, 7, -3, -4, 9, 10, -1, 11};
        int n1 = arr1.length;
        rearrange(arr1, n1);
        System.out.println("Array after rearranging: " + Arrays.toString(arr1));

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

            if (i < indexPos) {
                arr[i] = pos[i];
            }

            if (i >= indexPos) {
                arr[i] = neg[i-indexPos];
            }
        }

    }
}
