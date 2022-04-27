package com.Arrays.Rearrange;

import java.util.Arrays;

public class MinimumSwaps {

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 3};
        int n = arr.length;
        int k = 3;
        System.out.println(minSwap1(arr, n, k));  // output 1

        int arr1[] = {2, 7, 9, 5, 8, 7, 4};
        n = arr1.length;
        k = 6;
        System.out.println(minSwap1(arr1, n, k));  // output 2

        int arr2[] = {20, 12, 17};
        n = arr2.length;
        k = 6;
        System.out.println(minSwap1(arr2, n, k));   // output 0

        int arr3[] = {4, 11, 6, 5, 11, 20, 19, 14, 14, 2, 9, 20, 11, 11, 15, 1, 7, 12, 19, 9};
        n = arr3.length;
        k = 14;
        System.out.println(minSwap1(arr3, n, k));   // output 4

        int arr4[] = {4, 16, 3, 8, 13, 2, 19, 4, 12, 2, 7, 17, 4, 19, 1};
        n = arr4.length;
        k = 9;
        System.out.println(minSwap1(arr4, n, k));   // output 3
    }

    private static int minSwap(int[] arr, int n, int k) {
        int totalValues = 0, minSwap = 0;

        // Find out value less than or equal to k
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                totalValues++;
            }
        }

        // Find out value greater than k under the frame(size values)
        for(int i = 0; i < totalValues; i++) {
            if (arr[i] > k) {
                minSwap++;
            }
        }

        int result = minSwap;

        //create a frame (size of values)
        //frame can move by 1
        // value min swap under the each frame
        for (int i = 0, j = totalValues; j < n; i++, j++) {

            if(arr[i] > k) {
                minSwap--;
            }

            if(arr[j] > k) {
                minSwap++;
            }
            result = Math.min(result, minSwap);
        }

        return result;
    }


    static int minSwap1(int a[], int n, int k) {
        int lower = 0, upper = a.length - 1, count = 0;
        while (lower < upper) {
            if (a[lower] >= k) {
                if (a[upper] <= k) {
                    swap(a, lower, upper);
                    lower++;
                    upper--;
                    count++;
                } else {
                    upper--;
                }
            } else {
                lower++;
            }
        }

        return count;
    }

    private static void swap(int[] a, int lower, int upper) {
        int temp = a[lower];
        a[lower] = a[upper];
        a[upper] = temp;
    }

}
