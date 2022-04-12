package org.example;

import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            System.out.println("isPrime("+i+")"+isPrime(i));
        }
    }
    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(i -> number%i == 0);
    }
}
