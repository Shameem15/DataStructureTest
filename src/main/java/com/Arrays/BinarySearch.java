package com.Arrays;

import java.util.Arrays;

public class BinarySearch {

    // Main driver method
    public static void main(String[] args)
    {

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.sort(intArr);

        System.out.print("Sorted intArr = { ");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);
            String result = (intArr.length -1 == i) ? " }\n" :", ";
            System.out.print(result);
        }

        // To print the elements in one line
        System.out.println("Sorted intArr: " + Arrays.toString(intArr));

        int intKey = 22;

        // Print the key and corresponding index
        System.out.println(
                intKey + " found at index = "
                        + Arrays.binarySearch(intArr, intKey));

        // Get the Array
        int intArr1[][] = { { 10, 20, 15, 22, 35 },
                            { 12, 23, 16, 21, 37 }};

        // To get the deep String of the arrays
        System.out.println("Integer Array: "
                + Arrays.deepToString(intArr1));
    }
}
