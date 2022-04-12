package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicatesInString {
    private static String removeDuplicate(char str[], int n)
    {
        // Used as index in the modified string
        int index = 0;

        // Traverse through all characters
        for (int i = 0; i < n; i++)
        {

            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }

            // If not present, then add it to
            // result.
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
    static void removeDuplicateUsingSet(char str[], int n)
    {
        // Create a set using String characters
        // excluding '\0'
        HashSet<Character> s = new LinkedHashSet<>(n - 1);
        // HashSet doesn't allow repetition of elements
        for (char x : str)
            s.add(x);

        // Print content of the set
        for (char x : s)
            System.out.print(x);
    }

    public static void main(String[] args)
    {
        char str[] = "adfgfefghhkjwerweweerwe".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));


        Arrays.asList("aabbccsss".split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
    }
}
