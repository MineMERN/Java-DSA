// Import the java packages
import java.util.*;
// This code take the number from the use and check is it even or odd
public class L2D3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int num = 10;
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if( num % 2 == 0 ) {
            System.out.println("Number " + num + " is an even number!");
        } else {
            System.out.println("Number " + num + " is an odd number!");
        }
    }
}