package org.example;

import java.math.BigInteger;

public class FibonacciNumber {
    private static long[] fibonacciCache;

    public static void main(String[] args) {
        fibonacciCache = new long [5];
        System.out.println(findFibonacciNumber(4));
    }

    private static long findFibonacciNumber(int n){
        System.out.println("Find fibonacci number input:"+n);
        if(n <= 1){
            return n;
        }
        if(fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }
        long fibonacci =  (findFibonacciNumber(n-1) + findFibonacciNumber(n-2));
        fibonacciCache[n] = fibonacci;
        return fibonacci;
    }
    private static long findFibonacciNumberTwo(int n){
        System.out.println("Find fibonacci number input:"+n);
        if(n <= 1){
            return n;
        }
        if(fibonacciCache[n] != 0){
            return fibonacciCache[n];
        }
        long fibonacci =  (findFibonacciNumber(n-1) + findFibonacciNumber(n-2));
        fibonacciCache[n] = fibonacci;
        return fibonacci;
    }
    public static int fib(int n) {
        if (n <= 1) return n;

        int previous = 0, next = 1, sum;

        for (int i = 2; i <= n; i++) {
            sum = previous;
            previous = next;
            next = sum + previous;
        }

        return next;
    }

    public static BigInteger fib2(int n) {
        if (n <= 1) return BigInteger.valueOf(n);

        BigInteger previous = BigInteger.ZERO, next = BigInteger.ONE, sum;

        for (int i = 2; i <= n; i++) {
            sum = previous;
            previous = next;
            next = sum.add(previous);
        }

        return next;
    }
}
