
import java.util.Scanner;

public class L2D9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter operator: ");
        char opo = sc.next().charAt(0);
        switch (opo) {
            case '+': System.out.println("Result: " + ( num1 + num2 )); break;
            case '-': System.out.println("Result: " + ( num1 - num2 )); break;
            case '*': System.out.println("Result: " + ( num1 * num2 )); break;
            case '/': System.out.println("Result: " + ( num1 / num2 )); break;
            case '%': System.out.println("Result: " + ( num1 % num2 )); break;
            default: System.out.println("Invalied Operator!!");
        }
    }
}