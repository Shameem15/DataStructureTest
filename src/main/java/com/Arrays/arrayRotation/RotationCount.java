package com.Arrays.arrayRotation;

public class RotationCount {

    public static void main (String[] args)
    {
        int arr[] = {6, 1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("countRotations: " + countRotations(arr, n));
    }

    private static int countRotations(int[] arr, int n) {

        int low =0;
        int high = n-1;

        int pivot = getPivot(arr, low, high, n);
        System.out.println("pivot: " + pivot);
        if (pivot != -1)
            return (pivot+1) % n;

        return 0;
    }

    private static int getPivot(int[] arr, int low, int high, int n) {
        while (low < high) {

            /* int mid = low + (high - low) / 2;*/
            int mid = (low + high)/2;

            if (arr[mid] > arr[mid+1]){
                return mid;
            }
            if (arr[low] < arr[mid]){
                low = mid+1;
            }
            if (arr[mid] < arr[high]) {
                high = mid;
            }
        }
        return -1;
    }
}
