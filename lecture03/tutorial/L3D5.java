import java.util.*;
public class L3D5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
        System.out.print("Enter the correct number to escape the loop: ");
        num = sc.nextInt();
        if ( num % 10 == 0 ) {
            break;
        }
        } while ( true );
        System.out.println("You escape.");
    }
}