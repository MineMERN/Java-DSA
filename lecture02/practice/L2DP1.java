import java.util.*;
public class L2DP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        String nature = (num > 0) ? "Positive" : "Negative";
        System.out.println("Nature of the number: " + nature);
    }
}