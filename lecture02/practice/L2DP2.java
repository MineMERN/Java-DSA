import java.util.*;
public class L2DP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temp = sc.nextInt();
        String result = ( temp > 100 ) ? "you have fever" : "you not have fever";
        System.out.println(result);
    }
}