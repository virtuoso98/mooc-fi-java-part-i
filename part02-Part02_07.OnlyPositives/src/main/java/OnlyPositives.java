
import java.util.Scanner;
import java.lang.Math;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                break;
            }
            if (input > 0) {
                System.out.println(Math.pow(input, 2));
                continue;
            }
            
            if (input < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
        }
    }
}
