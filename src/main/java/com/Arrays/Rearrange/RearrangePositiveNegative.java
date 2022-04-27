package com.Arrays.Rearrange;

import java.util.Arrays;

/*
An array contains both positive and negative numbers in random order. Rearrange the array elements so that positive and
negative numbers are placed alternatively. Number of positive and negative numbers need not be equal.
If there are more positive numbers they appear at the end of the array. If there are more negative numbers,
they too appear in the end of the array.
For example, if the input array is [-1, 2, -3, 4, 5, 6, -7, 8, 9], then the output should be [9, -7, 8, -3, 5, -1, 2, 4, 6]
*/

public class RearrangePositiveNegative {

    public static void main (String[] args)
    {
        int arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        int n = arr.length;
        rearrange(arr, n);
        System.out.println("Array after rearranging: " + Arrays.toString(arr));
    }

    private static void rearrange(int[] arr, int n) {
        int posCount = 0, negCount = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] >= 0){
                posCount++;
            } else {
                negCount++;
            }
        }

        System.out.println("posCount: " + posCount);
        System.out.println("negCount: " + negCount);

        //Store positive and negative no. in different arrays
        int[] pos = new int[posCount];
        int[] neg = new int[negCount];
        int posIndex = 0, negIndex = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] >= 0){
                pos[posIndex] = arr[i];
                posIndex++;
            } else {
                neg[negIndex] = arr[i];
                negIndex++;
            }
        }
        System.out.println("pos arrys: " + Arrays.toString(pos));
        System.out.println("neg arrys: " + Arrays.toString(neg));

        boolean start = true;
        posIndex = 0;
        negIndex = 0;

        int size = pos.length;
        int sizeDif = neg.length - pos.length;
        boolean isNegSizeGreater = true;
        if(pos.length > neg.length){
            size = neg.length;
            sizeDif = pos.length - neg.length;
            isNegSizeGreater = false;
        }

        // both pos and neg arrys should update equally
        size = 2 * size;
        for (int i = 0; i < size; i++){
            if (start) {
                arr[i] = pos[posIndex];
                posIndex++;
                start = false;
            } else {
                arr[i] = neg[negIndex];
                negIndex++;
                start = true;
            }
        }

        System.out.println("size: " + size);
        for (int i = 0; i < sizeDif; i++) {
            if (isNegSizeGreater) {
                arr[size +i] = neg[negIndex];
                negIndex++;
            } else {
                arr[size +i] = pos[posIndex];
                posIndex++;
            }
        }

    }
}
