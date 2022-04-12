package org.example;

public class Palindrome {
    private static boolean isPalindrome(String input){
        if(input == null){
            return false;
        }
        for(int i = 0, j = input.length()-1; i < j ; i++, j--){
            if(input.charAt(i) != input.charAt(j)){
                return false;
            }
        }
        return true;
    }
    private static boolean isPalindromeUsingRecursion(String input, int start, int end){
        if(start >= end){
            return true;
        }
        if(input.charAt(start) != input.charAt(end)){
            return false;
        }
        return isPalindromeUsingRecursion(input, start+1, end-1);
    }
    private static boolean isPalindromeUsingRecursionTWO(String input, int start, int end){
       return start >= end || (input.charAt(start) == input.charAt(end) && isPalindromeUsingRecursionTWO(input, start+1, end-1));
    }
}
