import java.util.*;
public class L2DP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        String identifyYear = ( ( year % 4 ) == 0 ) ? " is leap year" : " is not leap year";
        System.out.println(year + identifyYear);
    }
}