//https://www.geeksforgeeks.org/find-element-given-index-number-rotations/

/*For better explanation:-

        10 20 30 40 50

        Index: 1

        Rotations: {0,2} {1,4} {0,3}

        Answer: Index 1 will have 30 after all the 3 rotations in the order {0,2} {1,4} {0,3}.

        We performed {0,2} on A and now we have a new array A1.

        We performed {1,4} on A1 and now we have a new array A2.

        We performed {0,3} on A2 and now we have a new array A3.

        Now we are looking for the value at index 1 in A3.

        But A3 is {0,3} done on A2.

        So index 1 in A3 is index 0 in A2.

        But A2 is {1,4} done on A1.

        So index 0 in A2 is also index 0 in A1 as it does not lie in the range {1,4}.

        But A1 is {0,2} done on A.

        So index 0 in A1 is index 2 in A.

        On observing it, we are going deeper into the previous rotations starting from the latest rotation.

        {0,3}

        |

        {1,4}

        |

        {0,2}

        This is the reason we are processing the rotations in reverse order.

        Please note that we are not rotating the elements in the reverse order, just processing the index from reverse.

        Because if we actually rotate in reverse order, we might get a completely different answer as in case of rotations the order matters.*/

package com.Arrays.arrayRotation;

import java.util.Arrays;

public class FindElementGivenIndex {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // No. of rotations
        int rotations = 2;

        // Ranges according to 0-based indexing
        int[][] ranges = {{0, 2 }, {0, 3}};

        int index = 1;
        System.out.println(findElement(arr, ranges, rotations, index));
    }

    private static int findElement(int[] arr, int[][] ranges, int rotations, int index) {

        //we are processing the rotations in reverse order
        for (int i = rotations-1; i>=0; i--) {
            int start = ranges[i][0];
            int end = ranges[i][1];

            if (start <= index && index <= end) {
                if (start == index) {
                    index = end;
                } else {
                    index--;
                }
            }
        }

        System.out.println("index: " + index);
        return arr[index];
    }
}
