import java.util.*;

public class L2D6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        String value = ((num % 2) == 0) ? "Even" : "Odd";
        System.out.println("Nature of numer is " + value);
    }
}