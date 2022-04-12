package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingCustomSorterAndStream {
    public static void main(String[] args) {
        List<String> citiesNames = new ArrayList<>();
        List<String> sortedByName = citiesNames.stream().sorted((s1, s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println("Sorted by Name : "+ sortedByName);

        List<String> reverseSortedByName = citiesNames.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println("Reverse Sorted by Name : "+ reverseSortedByName );
    }
}
