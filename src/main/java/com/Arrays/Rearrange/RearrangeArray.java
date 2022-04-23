package com.Arrays.Rearrange;

import java.util.Arrays;

public class RearrangeArray {

    public static void main(String[] args)
    {
        int n, ar[] = {1, 4, 3, -1, 2, 5};
        n = ar.length;

        // Function Call
        int[] fixed = Rearrange(ar, n);
        System.out.println("Rearrange Array: " + Arrays.toString(fixed));
    }

    private static int[] Rearrange(int[] arr, int n) {
        int temp;
        int i=0;
        while (i < n  ) {
            if (arr[i] >= 0 && arr[i] != i) {

                temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
            System.out.println(" Debug Array: " + Arrays.toString(arr));
        }
        return arr;
    }
}
