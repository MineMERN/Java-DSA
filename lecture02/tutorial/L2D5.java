
import java.util.*;

public class L2D5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        if (num1 > num2 && num2 > num3) {
            System.out.println("First is a greatest number.");
        } else if (num2 > num3) {
            System.out.println("Second is a greatest number.");
        } else {
            System.out.println("Third is a greatest number.");
        }
        // if (num1 > num2) {
        //     if (num1 > num3) {
        //         System.out.println("First is a greatest number.");
        //     } else {
        //         System.out.println("Third is a greatest number.");
        //     }
        // } else {
        //     if (num2 > num3) {
        //         System.out.println("Second is a greatest number.");
        //     } else {
        //         System.out.println("Third is a greatest number.");
        //     }
        // }

    }
}
