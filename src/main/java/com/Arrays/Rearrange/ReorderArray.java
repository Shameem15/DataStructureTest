package com.Arrays.Rearrange;

import java.util.Arrays;

public class ReorderArray {


    public static void main(String[] arg) {

        int arr[] = new int[]{50, 40, 70, 60, 90};
        int index[] = new int[]{3,  0,  4,  1,  2};

        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("index: " + Arrays.toString(index));

        reorder(arr, index);
        System.out.println("reorder arr : " + Arrays.toString(arr));
        System.out.println("reorder index: " + Arrays.toString(index));
    }

    private static void reorder(int[] arr, int[] index) {
        int n = arr.length;
        int[] tempArray = Arrays.copyOf(arr, n);

        for (int i = 0; i < n; i++) {
            arr[index[i]] = tempArray[i];
        }

        for(int i = 0; i < n; i++){
            index[i] = i;
        }
    }
}
