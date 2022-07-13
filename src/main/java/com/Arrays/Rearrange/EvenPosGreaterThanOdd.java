package com.Arrays.Rearrange;

import java.util.Arrays;
/*
Rearrange array such that even positioned are greater than odd
*/
public class EvenPosGreaterThanOdd {

    public static void main(String[] args) {

        int n,  arr[] = {1, 2, 2, 1};
        n = arr.length;
        System.out.println("Rearrange Array: " + Arrays.toString(rearrange(arr, n)));  // [1, 2, 1, 2]

        int n1,  arr1[] = {1, 3, 2};
        n1 = arr1.length;
        System.out.println("Rearrange Array: " + Arrays.toString(rearrange(arr1, n1))); //[1, 3, 2]

        int n2,  arr2[] = {1, 3, 2, 2, 5};
        n2 = arr2.length;
        System.out.println("Rearrange Array: " + Arrays.toString(rearrange(arr2, n2))); //[1, 5, 2, 3, 2]
    }

    private static int[] rearrange(int[] arr, int n) {

        int[] temp = Arrays.copyOf(arr, n);
        Arrays.sort(temp);
        int indexTemp = 0;
        if(n % 2 == 0){
            for (int i = 0; i <= n-2; i = i + 2){
                arr[i] = temp[indexTemp];
                indexTemp++;
            }

            for (int i = n-1; i >= 1; i = i - 2){
                arr[i] = temp[indexTemp];
                indexTemp++;
            }

        } else {

            for (int i = 0; i <= n-1; i = i + 2){
                arr[i] = temp[indexTemp];
                indexTemp++;
            }

            for (int i = n-2; i >= 1; i = i - 2){
                arr[i] = temp[indexTemp];
                indexTemp++;
            }
        }

        return arr;
    }

    /*private static ArrayList<Integer> assign(int a[], int n)
    {
        // Complete the function
        int[] temp = Arrays.copyOf(a, n);
        Arrays.sort(temp);
        int indexTemp = 0;
        if(n % 2 == 0){
            for (int i = 0; i <= n-2; i = i + 2){
                a[i] = temp[indexTemp];
                indexTemp++;
            }

            for (int i = n-1; i >= 1; i = i - 2){
                a[i] = temp[indexTemp];
                indexTemp++;
            }

        } else {

            for (int i = 0; i <= n-1; i = i + 2){
                a[i] = temp[indexTemp];
                indexTemp++;
            }

            for (int i = n-2; i >= 1; i = i - 2){
                a[i] = temp[indexTemp];
                indexTemp++;
            }
        }
        Arrays.asList(a);

        ArrayList<Integer> result = new ArrayList<>();

        for (int element:a ) {
            result.add(element);
        }

        return result;
    }*/
}
