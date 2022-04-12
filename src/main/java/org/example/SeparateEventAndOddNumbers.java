package org.example;
//https://tutorialspoint.dev/algorithm/sorting-algorithms/sort-even-numbers-ascending-order-sort-odd-numbers-descending-order
import java.util.Arrays;
import java.util.Collections;

public class SeparateEventAndOddNumbers {
    static void twoWaySort(Integer arr[], int n)
    {
        // Current indexes from left and right
        int left = 0, right = n-1;

        // Count of odd numbers
        int oddCount = 0;

        while (left < right)
        {
            // Find first odd number from left side.
            while (arr[left]%2 != 0)
            {
                left++;
                oddCount++;
            }

            // Find first even number from right side.
            while (arr[right]%2 == 0  && left<right)
                right--;

            // Swap odd number present on left and even
            // number right.
            if (left < right)
            {
                //  swap arr[left] arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

            }

        }

        // Sort odd number in descending order
       Arrays.sort(arr, 0, oddCount, Collections.reverseOrder());

        // Sort even number in ascending order
       Arrays.sort(arr, oddCount, n);
    }

    // Driver Method
    public static void main(String[] args)
    {
        Integer arr[] = {1, 3, 2, 7, 5, 4};

        twoWaySort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
