package com.Arrays.arrayRotation;

import java.util.Arrays;

public class CyclicallyRotate {

    static int arr[] = new int[]{1, 2, 3, 4, 5};

    // Method for rotation
    static void rotate()
    {
        for(int i = arr.length-1; i>0; i--)
        {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
    }

    /* Driver program */
    public static void main(String[] args)
    {
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));

        rotate();

        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));
    }
}
