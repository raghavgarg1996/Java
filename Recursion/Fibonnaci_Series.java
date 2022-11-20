package Recursion;

public class Fibonnaci_Series {
    public static void fibonnaci(int a, int b, int n) {

        if (n==0) {
            return ;
        }
        int c = a+b;
        System.out.println(c);
        fibonnaci(b,c,n-1 );
    }
    public static void main(String[] args) {
        int a = 0,b = 1;
        int n =7;
        System.out.println(a);
        System.out.println(b);
        fibonnaci(a,b,n-2);
    }
}
