package com.Arrays.arrayRotation;


import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Print array: " + Arrays.toString(arr));

        arr = rolate(arr, 2);
        System.out.println("Print rolated array: " + Arrays.toString(arr));
    }

    private static int[] rolate(int[] arr, int index)
    {
        index = index % arr.length;
        System.out.println("Updated index : " + index);

        for (int i=0; i<index; i++)
        {
            int temp = arr[0];

            for (int j=0; j< arr.length-1; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }

        return arr;
    }
}
