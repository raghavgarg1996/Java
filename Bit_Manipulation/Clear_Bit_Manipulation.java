package Bit_Manipulation;

public class Clear_Bit_Manipulation {
    public static void main(String args[]) {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
