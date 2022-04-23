package com.Arrays.arrayRotation;

/*Queries on Left and Right Circular shift on array
* define {1, 3}
* 1--> for type of case
* 3--> no of rotation
*
* define {3, 0, 2}
*  3 --. for type of rotation
*  0 --> start index
*  2 --> last index
*
*
* */
public class QueriesLeftRightCircularShift {
    public static void main(String[] args) {
        queryArray(
                new int[]{1, 2, 3, 4, 5},
                new int[][]{{1, 3}, {3, 0, 2}, {2, 1}, {3, 1, 4}});
    }

    private static void queryArray(int[] arr, int[][] queries) {
        int n = arr.length;
        int start = 0;
        if (arr == null || queries == null || arr.length == 0 || queries.length == 0) {
            return;
        }


        for (int[] query : queries) {
            if (query == null || query.length == 0) {
                continue;
            }


            int type = query[0];
            switch (type) {
                case 1:
                    // right shift - start will shift to left in original array
                    // assert query size is 2.
                    start = (start - query[1] + n) % n;              // for right one rotation, current index decreased by one, startIndex = (startIndex - no of rotation)
                    System.out.println("start case 1: " + start);
                    break;
                case 2:
                    // left shift - start will shift to right in original array
                    // assert query size is 2.
                    start = (start + query[1] + n) % n;             // for left one rotation, current index increased by one, startIndex = (startIndex + no of rotation)
                    System.out.println("start case 2: " + start);
                    break;
                case 3:
                    // find sum
                    // assert query size is 3.
                    int sum = 0;
                    for (int i = query[1]; i<=query[2]; i++) {
                        int index = (start + i) % n;
                        sum = sum + arr[index];
                    }
                    System.out.println("sum : " + sum);
            }
        }

    }


}
