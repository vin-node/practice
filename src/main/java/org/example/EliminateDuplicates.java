package org.example;
//https://stackoverflow.com/questions/17967114/how-to-efficiently-remove-duplicates-from-an-array-without-using-set

public class EliminateDuplicates {
    public static void main(String args[]){
        int[] integerArray = {1,2,2,3,4,5,5,5,6,7,7,7};
        //eliminateDuplicates(integerArray);
        //Arrays.stream(integerArray).forEach(System.out::println);
        int lastValidIndex = eliminateDuplicates(integerArray);
        for (int i = 0; i <= lastValidIndex; i++) {
            System.out.println(integerArray[i]);
        }
    }
    private static int eliminateDuplicates(int[] inputArray){
        int length = inputArray.length;
        int j = 0;
        for(int i=0; i<length-1; i++){
            if(inputArray[i] != inputArray[i+1]){
                inputArray[j] = inputArray[i];
                j++;
            }
        }
        inputArray[j] = inputArray[length-1];
        return j;
    }
    private static void eliminateDups(int[] a){
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j] = a[i];
                j++;
            }
        }
        a[j] = a[a.length - 1];
        for (int i = 0; i <= j; i++) {
            System.out.println(a[i]);
        }
    }

}
