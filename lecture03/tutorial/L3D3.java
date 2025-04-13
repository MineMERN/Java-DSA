
import java.util.Scanner;

public class L3D3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of sqaure: ");
        int len = sc.nextInt();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}