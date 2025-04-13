import java.util.*;

public class L3D7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if ( num == 1 || num == 2 ) {
            System.out.println("Its an prime number.");
            return;
        }
        for ( int i = 2; i <= Math.sqrt(num); i++ ) {
            if( num%i == 0 ) {
                System.out.println("Its an non prime number.");
                return; 
            }
        }
        System.out.println("Its an prime number");
    }
}
