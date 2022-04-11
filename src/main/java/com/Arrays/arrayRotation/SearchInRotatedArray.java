package com.Arrays.arrayRotation;

public class SearchInRotatedArray {

    // main function
    public static void main(String args[])
    {
        // Let us search 10 in below array
        int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
        int n = arr1.length;
        int key = 3;
        // l for lowest index
        // h for highest index
        int index = search(arr1, 0, n-1, key);
        if (index != -1) {
            System.out.println(key + " is found at index " + index);
        } else {
            System.out.println("There is no element that has value " + key);
        }
    }

    private static int search(int[] arr1, int l, int h, int key) {
        int mid = (l+h)/2;

        if (l > h){
            return -1;
        }

        if(arr1[mid] == key){
            return mid;
        }

        //Its means first half array is sorted
        if(arr1[l] <= arr1[mid]){
            if (key <= arr1[mid] && key >= arr1[l]) {
                return search(arr1, l, mid-1, key);
            } else {
                return search(arr1, mid+1, h, key);
            }
        }

        if (key >= arr1[mid] && key<= arr1[h]){
            return search(arr1, mid+1, h, key);
        } else {
            return search(arr1, l, mid-1, key);
        }

    }

}
