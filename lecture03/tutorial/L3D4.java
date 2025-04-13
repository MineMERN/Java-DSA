import java.util.*;
public class L3D4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int newNum = 0;
        while ( num > 0 ) {
            int lastDegit = num % 10;
            newNum = (newNum * 10) + lastDegit;
            num = num / 10;
        }
            System.out.println("Reverse number: " + newNum);
        // System.out.print("");
    }
}