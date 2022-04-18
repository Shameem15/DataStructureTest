package com.Arrays.arrayRotation;

import java.util.Arrays;

/*Time Complexity: O(n)
  Space Complexity: O(1)*/
public class ReversalRightRotate {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Array: " + Arrays.toString(arr));

        int n = arr.length;
        int k = 3;

        rightRotate(arr, k, n);
        System.out.println("Rotated Array: " + Arrays.toString(arr));

    }

    private static void rightRotate(int[] arr, int k, int n) {

        k = k % n;

        if (k == 0)
            return;

        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
