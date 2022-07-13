package com.Arrays.Rearrange;

import java.util.Arrays;

/*
* Rearrange an array in order – smallest, largest, 2nd smallest, 2nd largest, ..
* */
public class OrderSmallestLargest {

    public static void main(String[] args) {

        int n,  arr[] = {5, 8, 1, 4, 2, 9, 3, 7, 6};
        n = arr.length;
        rearrange(arr, n);
        System.out.println("Rearrange Array: " + Arrays.toString(arr));  // [1, 9, 2, 8, 3, 7, 4, 6, 5]

        int n1,  arr1[] = {1, 2, 3, 4};
        n1 = arr1.length;
        rearrange(arr1, n1);
        System.out.println("Rearrange Array: " + Arrays.toString(arr1)); //[1, 4, 2, 3]

        int n2,  arr2[] = {1, 9, 2, 8, 3, 7, 4, 6, 5};
        n2 = arr2.length;
        rearrange(arr2, n2);
        System.out.println("Rearrange Array: " + Arrays.toString(arr2)); //[1, 9, 2, 8, 3, 7, 4, 6, 5]
    }

    private static void rearrange(int[] arr, int n) {

        int[] tempArr = Arrays.copyOf(arr, n);
        Arrays.sort(tempArr);

        int indexTemp = 0;
        if(n % 2 == 0){
            for (int i = 0; i <= n-2; i = i + 2){
                arr[i] = tempArr[indexTemp];
                indexTemp++;
            }

            for (int i = n-1; i >= 1; i = i - 2){
                arr[i] = tempArr[indexTemp];
                indexTemp++;
            }

        } else {

            for (int i = 0; i <= n-1; i = i + 2){
                arr[i] = tempArr[indexTemp];
                indexTemp++;
            }

            for (int i = n-2; i >= 1; i = i - 2){
                arr[i] = tempArr[indexTemp];
                indexTemp++;
            }
        }

    }

}
