
import java.util.*;

 
public class L2D7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();
        String result = ( marks > 33 ) ? "PASS" : "FAIL";
        System.out.println("Student is " + result);
    }
}