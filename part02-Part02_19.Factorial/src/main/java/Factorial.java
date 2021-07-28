
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        int input = Integer.valueOf(scanner.nextLine());
        int fac = 1;
        
        for (int i = 1; i < input + 1; i++) {
            fac *= i;
        }
        
        System.out.println("Factorial: " + fac);
    }
}
