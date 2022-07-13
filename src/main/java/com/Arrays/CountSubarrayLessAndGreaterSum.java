package com.Arrays;

public class CountSubarrayLessAndGreaterSum {

    public static void main(String[] args) {
        CountSubarrayLessAndGreaterSum ins = new CountSubarrayLessAndGreaterSum();

        int A[] = {15, 8, 16};
        int B = 242;
        int count = ins.solve(A, B);
        System.out.println("count: " + count);  //should be 2

        int C[] = {3, 12, 11, 11, 11, 15};
        int D = 12;
        int count1 = ins.solve(C, D);
        System.out.println("count: " + count1);  //should be 7
    }

    public int solve(int[] A, int B) {
        int start = 0, end = 0, sum = 0, count = 0, element = 1, n = A.length;
        while (start < n && end < n && element <= n ) {
            sum = sum + A[end];
            if (element % 2 == 0 ) {
                if (sum < B) {
                    count++;
                    if (end != n - 1) {
                        end++;
                        element++;
                        continue;
                    }
                }
            } else {
                if (sum > B) {
                    count++;
                    if (end != n - 1) {
                        end++;
                        element++;
                        continue;
                    }
                }
            }
            if (end == n - 1) {
                start++;
                end = start;
                element = 1;
                sum = 0;
            } else {
                end++;
                element++;
            }
        }
        return count;
    }
}
