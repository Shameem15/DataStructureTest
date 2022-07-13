package com.Arrays.Rearrange;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FormBiggestNo {

    public static void main(String[] args) {

        String[] arr = {"54", "546", "548", "60"};
        System.out.println(printLargest(arr));

        String[] arr1 = {"1", "34", "3", "98", "9", "76", "45", "4"};
        System.out.println(printLargest(arr1));
    }

    private static String printLargest(String[] arr) {

        List<String> list = Arrays.asList(arr);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String X, String Y) {
                String XY = X + Y;
                String YX = Y + X;

                return XY.compareTo(YX) > 0? -1:1;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String str: list) {
            sb.append(str);
        }

        return sb.toString();
    }
}
