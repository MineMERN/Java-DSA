
import java.util.*;

public class L4D1 {

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int factorial(int num1) {
        int n = 1;
        for (int i = num1; i > 0; i--) {
            n *= i;
        }
        return n;
    }

    public static void isPrime(int num) {
        if (num == 2) {
            System.out.println("Its an prime number.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println("Its not an prime number.");
                return;
            }
        }
        System.out.println("Its an prime number.");
    }

    public static void binaryToDecimal( int binNum ) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) { 
            int lastDigit = binNum % 10;
            decNum = decNum + ( lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }
    
    public static void decimalToBinary( int decNum ) {
        int myNum = decNum;
        int binNum = 0;
        while (decNum > 0) { 
            int num = decNum % 2;
            binNum = ( binNum * 10 ) + num;
            decNum = decNum / 2;
        }
        int n = 0;
        int num = 0;
        while ( binNum > 0 ) {
            n = binNum % 10;
            num = ( num * 10 ) + n;
            binNum = binNum / 10;
        }
        System.out.println("binary of " + myNum + " = " + num);
    }

    public static boolean rangePrimeNumber(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int binomialCoefficient(int num1, int num2) {
        int n = factorial(num1);
        int r = factorial(num2);
        int k = factorial(num1 - num2);
        return n / (r * k);
    }

    public static int product(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter first number: ");
        int num2 = sc.nextInt();
        // int sum = sum( num1, num2 );
        // System.out.println(sum);
        // System.out.println(product(num1, num2));
        // System.out.println(factorial(num1));
        // System.out.println(binomialCoefficient(num1, num2));
        // System.out.println(sum(num1, num2, num1));
        decimalToBinary(num1);
        decimalToBinary(num2);
        isPrime(num1);
        isPrime(num2);
        // for( int i = 0; i <= num1; i++ ) {
        //     boolean n = rangePrimeNumber(i);
        //     if (n) {
        //         System.out.print(i + ", ");
        //     }
        // }
        // System.out.println("are the prime numbers between 0 to " + num1);
    }
}
