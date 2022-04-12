package org.example;

public class Segregate0And1 {
    private static void segregate0And1One(int[] input){

        int length = input.length;
        int zeroCount = 0;
        for(int i=0; i<length; i++){
            if(input[i] == 0){
                zeroCount++;
            }
        }

        for(int i=0; i<zeroCount; i++){
            input[i] = 0;
        }
        for(int i=zeroCount; i<length; i++){
            input[i] = 1;
        }

    }
    private static void segregate0And1Two(int[] input){
        int length = input.length;
        int zeroIndex = 0;
        int oneIndex = length-1;

        while(zeroIndex < oneIndex){
            while(input[zeroIndex] == 0 && zeroIndex < oneIndex){
                zeroIndex++;
                System.out.println("zeroIndexat ONE"+zeroIndex);
            }
            while (input[oneIndex] == 1 && zeroIndex < oneIndex) {
                oneIndex--;
                System.out.println("oneIndex TWO"+oneIndex);
                System.out.println("zeroIndex TWO"+zeroIndex);
            }
            if(zeroIndex < oneIndex){
                input[zeroIndex] = 0;
                input[oneIndex] = 1;
                zeroIndex++;
                oneIndex--;
            }
        }

    }

    public static void main(String[] args) {

        int arr[] = new int[]{0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0};
        int i, arr_size = arr.length;

        segregate0And1Two(arr);

        System.out.print("Array after segregation is ");
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
