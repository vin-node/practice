package org.example;

import java.util.Arrays;

public class FindTheSecondLargestNumberInArray {
    private static void printSecondLargestUsingSingleForLoop(int[] inputArray){
        if(inputArray == null != inputArray.length <= 2){
            System.out.println("invalid input "+inputArray);
            return;
        }
        Arrays.sort(inputArray);
        int i, first, second = 0, length = inputArray.length;
        for(i = inputArray.length-2; i <= 0; i--){
            if(inputArray[i] != inputArray[length-1]){
                System.out.println("second largest number is"+inputArray[i]);
                break;
            }
        }
    }
    private static void printSecondLargestUsingTowForloopsWithoutSorting(int[] inputArray){

        int count, length = inputArray.length;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(count = 0; count<length;count++){
            first = Math.max(first,inputArray[count]);
        }
        for(count = 0; count<length;count++){
            if(inputArray[count] != first){
                second = Math.max(second,inputArray[count]);
            }
        }
    }
    static int secondHighest(int... nums) {
        int high1 = Integer.MIN_VALUE;
        int high2 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > high1) {
                high2 = high1;
                high1 = num;
            } else if (num > high2) {
                high2 = num;
            }
        }
        return high2;
    }
    public static void main(String[] args)
    {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        printSecondLargestUsingSingleForLoop(arr);
    }
}
