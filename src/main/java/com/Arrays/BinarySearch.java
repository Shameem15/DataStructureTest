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
        //System.out.print("}\n");
        int intKey = 22;

        // Print the key and corresponding index
        System.out.println(
                intKey + " found at index = "
                        + Arrays.binarySearch(intArr, intKey));
    }
}
