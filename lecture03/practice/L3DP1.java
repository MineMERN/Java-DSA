import java.util.*;

public class L3DP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int evenSum = 0, oddSum = 0;
        for ( int i = 0; i <= num; i++ ) {
            if ( i % 2 == 0 ) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Sum of Even number: " + evenSum );
        System.out.println("Sum of odd number: " + oddSum );
    }
}
