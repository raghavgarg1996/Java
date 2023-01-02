package Recursion;

public class Tower_Of_Hannoi {

    public static void towerOfHanoi(int n, String src, String helper, String dest) { // In towner of hannoi we will be getting 4 items
                                                                      // total no. of disks -n, 3 strings will be there
                                                                    // first string tells which is source
                                                                      // second string which is helper
                                                                      // third string which is destination
        towerOfHanoi(n-1,src,dest, helper); // Here helper works as destination, and destination work as helper
        System.out.println("transfer");

    }

    public static void main(String[] args) {
        int n = 3;


    }
}
