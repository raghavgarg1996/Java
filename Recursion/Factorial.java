package Recursion;

public class Factorial {
    public static int factorial(int n) {

        if (n==1 || n==0) {
            return 1;
        }

        int fact_n = n * factorial(n-1);
        return fact_n;

    }
    public static void main(String[] args) {
        int  n=5;
        int k = factorial(n);
        System.out.println(k);
    }
}
