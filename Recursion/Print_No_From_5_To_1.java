package Recursion;

public class Print_No_From_5_To_1 {
    public static void printfNum(int n) {
        if (n==0) {
            return ;
        }
        System.out.print(n +" ");
        printfNum(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        printfNum(n);
    }
}
