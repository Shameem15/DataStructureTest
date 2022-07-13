package com.Arrays.arrayRotation;

import java.util.Arrays;

/*
* Hamming distance between two arrays or strings of equal length is the number of positions
* at which the corresponding characters (elements) are different.
* */
public class MaxHammingDist {

    public static void main (String[] args)
    {
        int arr[] = { 2, 4, 8, 0 };
        int n = arr.length;
        System.out.println("actualArrys: " + Arrays.toString(arr));
        System.out.println("MaxHammingDist: " + maxHamming(arr, n));  //output:4
    }

    private static int maxHamming(int[] arr, int n) {
        int maxHam = 1;
        int currentHam = 0;
        int[] actualArrys = new int[n];
        assignToTemArrays(arr, actualArrys, n);
        for (int i = 0; i < n-1; i++) {
            leftRotate(arr, n);
            System.out.println("leftRotate: " + Arrays.toString(arr));
            currentHam = arraysCompare(actualArrys, arr, n);

            if(currentHam == n){
                return currentHam;
            }
            if (currentHam > maxHam){
                maxHam = currentHam;
            }
        }
        return maxHam;
    }

    private static int arraysCompare(int[] temp, int[] arr, int n) {
        int currHam = 0;
        for (int i = 0; i< n; i++){

            if (temp[i] != arr[i]){
                currHam++;
            }
        }
        return currHam;
    }

    private static void assignToTemArrays(int[] arr, int[] temp, int n) {
        for (int i = 0; i< n; i++){
            temp[i] = arr[i];
        }
    }

    private static void leftRotate(int[] arr, int n) {
       int temp = arr[0];
       for (int i=0; i<n-1; i++){
           arr[i] = arr[i+1];
       }
       arr[n-1] = temp;
    }
}
