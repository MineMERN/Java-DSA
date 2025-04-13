import java.util.*;

public class L2D4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount(In lakhs): ");
        int amount = sc.nextInt();
        if( amount < 5 ) {
            System.out.println("Their will be no tax on below 5lakh!");
        } else if( amount > 5 && amount < 10 ) {
            System.out.println("20% tax will be diducted!");
        } else {
            System.out.println("30% tax will be diducted!");
        }
    }
}