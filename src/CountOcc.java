import java.util.Scanner;

public class CountOcc {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number: ");
        int n = in.nextInt();
    System.out.println("Enter the number you want to count occurrence for");
     int oc = in.nextInt();


        int count = 0;
        while ( n > 0) {
            int rem = (n % 10);
            if (rem == oc) {        
                count++;
            }
            n /= 10; // n = n/10
        }

        System.out.println(" The count of the number "+ oc + " is " + count);
    }

}

// public class CountOcc {
//    public static void main(String[] args){
//        int n = 54989900;
//
//        int count = 0;
//        while ( n > 0) {
//            int rem = n % 10;
//            if (rem == 9) {
//                count++;
//            }
//            n /= 10; // n = n/10
//        }
//
//        System.out.println(count);
//    }
//
//}