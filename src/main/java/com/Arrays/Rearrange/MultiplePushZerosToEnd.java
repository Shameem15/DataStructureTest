package com.Arrays.Rearrange;

import java.util.Arrays;

/*Double the first element and move zero to end*/
public class MultiplePushZerosToEnd {

    public static void main(String[] args)
    {
        int arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 0, 8 };
        int n = arr.length;
        System.out.println("Original array: " + Arrays.toString(arr));
        modifyAndRearrangeArr(arr, n);
        System.out.println("Modified array: " + Arrays.toString(arr) + "\n"); //[4, 2, 12, 8, 0, 0, 0, 0, 0, 0]

        int arr1[] = { 2, 2, 0, 4, 0, 8 };
        int n1 = arr1.length;
        System.out.println("Original array: " + Arrays.toString(arr1));
        modifyAndRearrangeArr(arr1, n1);
        System.out.println("Modified array: " + Arrays.toString(arr1) + "\n"); //[4, 4, 8, 0, 0, 0]

    }

    private static void modifyAndRearrangeArr(int[] arr, int n) {

        for (int i = 0; i < n-1; i++){
            if (arr[i] == 0){
                continue;
            }

            if (arr[i] != 0 && arr[i] == arr[i+1]) {
                arr[i] = 2 * arr[i];
                arr[i+1] = 0;
            }
        }

        int index = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] == 0){
                continue;
            }
            if(arr[i] > 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        for (int i = index; i < n; i++){
            arr[i] = 0;
        }
    }
}
