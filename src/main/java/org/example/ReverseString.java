package org.example;

public class ReverseString {
    private static void reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
            System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        String str = "reverse test";

        System.out.println(reverseString(str));
    }
    private static void reverseUsingWhile(String input){
        int length = input.length();

        while(length >0){
            System.out.print(input.charAt(length -1));
            length--;
        }
    }
    private static String reverseString(String str) {
        char ch;
        StringBuilder nstr = new StringBuilder();
        for (int i=str.length()-1; i >= 0; i--)
        {
            ch= str.charAt(i); //extracts each character
            nstr.append(ch); //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
        return nstr.toString();
    }
    public static String inPlaceReverse(final String input) {
        final StringBuilder builder = new StringBuilder(input);
        int length = builder.length();
        for (int startIndex = 0; startIndex < length / 2; startIndex++) {
            final char current = builder.charAt(startIndex);
            final int endIndex = length - startIndex - 1;
            builder.setCharAt(startIndex, builder.charAt(endIndex)); // swap
            builder.setCharAt(endIndex, current);
        }

        return builder.toString();
    }

}
