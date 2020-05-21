package com.olamide.series;

public class Series {
    public static int nSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n = n + nSum(n - 1);
        }
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n = n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n== 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            return  (n -1) + (n - 2);
        }

    }
}
