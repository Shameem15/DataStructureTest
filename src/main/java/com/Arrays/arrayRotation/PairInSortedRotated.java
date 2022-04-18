package com.Arrays.arrayRotation;

import java.util.SortedMap;

public class PairInSortedRotated {

    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 7, 9, 10};
        int sum = 16;
        int n = arr.length;

        if (pairInSortedRotated(arr, n, sum))
            System.out.println("Array has two elements with sum 16");
        else
            System.out.println("Array doesn't have two elements with sum 16 ");


        /* Numbers of pair */
        int totalPair = getNumberOfPair(arr, n, sum);
        System.out.println("Total Pair: " + totalPair);
    }

    private static int getNumberOfPair(int[] arr, int n, int sum) {

        System.out.println();
        System.out.println("**** numberOfPair ****");
        int pivot = getPivot(arr, 0, n - 1);

        int greatestValueIndex = pivot;
        int lowestValueIndex = (pivot+1) % n ;
        int numberOfPair = 0;

        while (greatestValueIndex != lowestValueIndex){

            if (arr[greatestValueIndex] + arr[lowestValueIndex] == sum){
                numberOfPair++;
                System.out.println("There is a pair (" + arr[greatestValueIndex] + "," + arr[lowestValueIndex] + ") with sum " + sum);

            }

            if (arr[greatestValueIndex] + arr[lowestValueIndex] < sum) {
                lowestValueIndex = (lowestValueIndex+1) % n;
            } else {
                greatestValueIndex = (n + greatestValueIndex-1) % n;
            }
        }

        return numberOfPair;
    }

    private static boolean pairInSortedRotated(int[] arr, int n, int sum) {

        int pivot = getPivot(arr, 0, n - 1);
        System.out.println("pivot: " + pivot);

        int greatestValueIndex = pivot;
        int lowestValueIndex = (pivot+1) % n ;
        int numberOfPair = 0;

        while (greatestValueIndex != lowestValueIndex){

            if (arr[greatestValueIndex] + arr[lowestValueIndex] == sum){
                numberOfPair++;
                System.out.println("There is a pair (" + arr[greatestValueIndex] + "," + arr[lowestValueIndex] + ") with sum " + sum);
                return true;
            }

            if (arr[greatestValueIndex] + arr[lowestValueIndex] < sum) {
                lowestValueIndex = (lowestValueIndex+1) % n;
            } else {
                greatestValueIndex = (n + greatestValueIndex-1) % n;
            }
        }

        return false;
    }

    private static int getPivot(int[] arr, int low, int high) {
        if (low > high) {
            return -1;
        }

        if (low == high) {
            return low;
        }

        int mid = (low + high) / 2;

        if (arr[mid] > arr[mid + 1]) {
            return mid;
        }

        if (arr[mid - 1] > arr[mid]) {
            return mid - 1;
        }

        if (arr[low] >= arr[mid]) {
            return getPivot(arr, low, mid - 1);
        } else {
            return getPivot(arr, mid + 1, high);
        }

    }

}
