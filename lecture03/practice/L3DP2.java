
import java.util.*;

public class L3DP2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1, 2, 3, 4, 5, 6
        // 1, 1, 2, 3, 5, 8
        System.out.print("Enter index of factorial: ");
        int num = sc.nextInt();
        int n1 = 0, n2 = 1, n3 = 0;
        for (int i = 1; i < num; i++) {
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
        System.out.println("The factorial at index " + num + " is " + n3);
    }
}
