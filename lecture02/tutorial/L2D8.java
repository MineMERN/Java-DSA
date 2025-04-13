import java.util.*;
public class L2D8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number between 1 to 5 and it will tell yor emotion: ");
        int num = sc.nextInt();
        switch(num) {
            case 1: System.out.println("Happy"); break;
            case 2: System.out.println("Normal"); break;
            case 3: System.out.println("Sad"); break;
            case 4: System.out.println("Motivated"); break;
            case 5: System.out.println("Disciplin"); break;
            default: System.out.println("Come agian later");;
        }
    }
}