import java.util.*;
public class L3D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number that how much time you want to build hello world: ");
        int num = sc.nextInt();
        int count = 1;
        while ( num >= 1) {
            System.out.println( count + ". Hello world" );
            count++;
            num--;
        }
    }
}