package com.Arrays.Rearrange;

import java.util.Arrays;

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
