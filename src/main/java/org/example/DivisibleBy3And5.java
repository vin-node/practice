package org.example;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DivisibleBy3And5 {
    private static void printNumberDivisibleBy3And5(int n){
        int counter =0;
        while(counter < n){
            if(counter % 3 ==0 && counter % 5 ==0){
                System.out.println(counter + "-> number is divisible by 3 and 5");
            }
            counter++;
        }
    }

    public static void main(String[] args) {
        printNumberDivisibleBy3And5(100);
        printNumbersDivisibleBy3And5UsingStreams(100);
    }

    private static void printNumbersDivisibleBy3And5UsingStreams(int n){
        IntStream.rangeClosed(0,n).boxed().filter( i -> (i % 3 ==0 && i % 5 ==0)).collect(Collectors.toList()).forEach(System.out::println);
    }
}
