package com.Arrays.Rearrange;

import java.util.Arrays;

/* Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i */
public class RearrangeArray1 {

    public static void main(String[] args) {
        //int n, arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n,  arr[] = {1, 2, 1, 4, 5, 6, 8, 8};
        n = arr.length;

        // Function Call
        int[] fixed;
        fixed = Rearrange(arr, n);
        System.out.println("Rearrange Array: " + Arrays.toString(fixed));
    }

    private static int[] Rearrange(int[] arr, int n) {
        Arrays.sort(arr);
        int[] temp = new int[n];
        int tempIndex = 0;
        for(int i=0; i<n; i++) {
            temp[i] = arr[i];
        }

        //If last element is odd position
        if(n % 2 != 0) {
            for (int i = n - 1; i >= 0; i = i - 2) {
                arr[i] = temp[tempIndex];
                tempIndex++;
            }

            for (int i = 1; i < n; i = i + 2) {
                arr[i] = temp[tempIndex];
                tempIndex++;
            }
        }

        //If last element is even position
        tempIndex = temp.length-1;
        if(n % 2 == 0) {
            for (int i = n - 1; i >= 0; i = i - 2) {
                arr[i] = temp[tempIndex];
                tempIndex--;
            }

            for (int i = 0; i < n; i = i + 2) {
                arr[i] = temp[tempIndex];
                tempIndex--;
            }
        }
        return arr;
    }

}
