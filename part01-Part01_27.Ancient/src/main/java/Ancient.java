
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int num = Integer.valueOf(scan.nextLine());
        if (num < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
