package com.Arrays.arrayRotation;

import java.util.Arrays;

public class LeftRotate {

    public static void main (String[] args)
    {
        int arr[] = {1, 3, 5, 7, 9};
        int n = arr.length;

        int k = 2;
        int arr1[] = {1, 3, 5, 7, 9};
        leftRotate(arr1, n, k);
        System.out.println(Arrays.toString(arr1));

        k = 3;
        int arr2[] = {1, 3, 5, 7, 9};
        leftRotate(arr2, n, k);
        System.out.println(Arrays.toString(arr2));

        k = 4;
        int arr3[] = {1, 3, 5, 7, 9};
        leftRotate(arr3, n, k);
        System.out.println(Arrays.toString(arr3));
    }

    private static void leftRotate(int[] arr, int n, int k) {
        k = k % n;

        if (k == 0){
            return;
        }
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);

    }

    private static void reverse(int[] arr, int start, int end) {
        int temp;
        while (start < end) {

            temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }

}
