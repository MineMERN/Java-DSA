
import java.util.Scanner;

public class L3D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number till you want sum: ");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;
        while( num >= 0) {
            sum += num;
            num--;
        }
        System.out.println("Sum of number till 0 to " + n + " is " + sum);
    }
}