package com.Arrays.Rearrange;

public class ReverseString {

    public static void main(String[] args) {
        String input = "Geeks";
        System.out.println("word: " + input);
        String result = reverseWord(input);
        System.out.println("reverse word: " + result);

        System.out.println("reverse word other method: " + reverseWordOtherMethod(input));

    }

    private static String reverseWord(String str) {

        char[] charArray = str.toCharArray();

        int start = 0;
        int end = charArray.length-1;
        char temp;
        while (start < end) {
            temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        return String.valueOf(charArray);
    }


    private static String reverseWordOtherMethod(String str) {

        //String rev = "";
        StringBuffer rev = new StringBuffer();

        for (int i = str.length()-1; i >= 0; i--) {
            //rev = rev + str.charAt(i);
            rev.append(str.charAt(i));
        }
        return rev.toString();
    }

}
