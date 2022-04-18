package com.Arrays.arrayRotation;

/*
*
* For unsorted Arrays
Let arr = [A0, A1, A2, A3]

R0 = 0*A0 + 1*A1 + 2*A2 + 3*A3
R1 = 0*A3 + 1*A0 + 2*A1 + 3*A2

R1 - R0 = A0 + (2*A1 - 1*A1) + (3*A2 - 2*A2) - 3*A3
= A0 + A1 + A2 - 3*A3 -> This has missing A3 in arrSum
= A0 + A1 + A2 + (A3 - A3) - 3*A3 -> Adding Subtracting A3
= A0 + A1 + A2 + A3 - 4*A3
= arrSum - n*arr[n-j]

*
* R(j) - R(j-1) = arrSum - (n)* arr[n-j]
* */

public class MaxValueSum {

    static int arr[] = {8, 3, 1, 2};

    public static void main(String[] args) {
        System.out.println("Max sum is " + maxSum());
    }

    private static int maxSum() {
        // Find array sum and i*arr[i] with no rotation
        int arrSum = 0;  // Stores sum of arr[i]
        int currVal = 0;  // Stores sum of i*arr[i]
        for (int i=0; i<arr.length; i++)
        {
            arrSum = arrSum + arr[i];
            currVal = currVal+(i*arr[i]);
        }

        // Initialize result as 0 rotation sum
        int maxVal = currVal;

        // Try all rotations one by one and find
        // the maximum rotation sum.
        for (int j=1; j<arr.length; j++)
        {
            currVal = currVal + arrSum-arr.length*arr[arr.length-j];
            if (currVal > maxVal)
                maxVal = currVal;
        }

        // Return result
        return maxVal;
    }

}
