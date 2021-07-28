
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        int acc = 0;
        
        for (int i = 1; i < last + 1; i++) {
            acc += i;
        }
        
        System.out.println("The sum is " + acc);
    }
}
