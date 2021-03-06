// Java program for reversal algorithm of array rotation

/*Example :
        Let the array be arr[] = [1, 2, 3, 4, 5, 6, 7], d =2 and n = 7
        A = [1, 2] and B = [3, 4, 5, 6, 7]


        Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
        Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
        Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]*/

package com.Arrays.arrayRotation;

import java.util.Arrays;

public class ReversalLeftRotate {
    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Array: " + Arrays.toString(arr));
        int n = arr.length;
        int d = 2;

        leftRotate(arr, d); // Rotate array by d
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    /* Function to left rotate arr[] of size n by d */
    static void leftRotate(int arr[], int d)
    {

        if (d == 0)
            return;

        int n = arr.length;
        // in case the rotating factor is
        // greater than array length
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    /*Function to reverse arr[] from index start to end*/
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
