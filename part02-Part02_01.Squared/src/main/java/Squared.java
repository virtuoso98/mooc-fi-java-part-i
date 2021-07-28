
import java.util.Scanner;
import java.lang.Math;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        int squared = (int) Math.pow(num, 2);
        System.out.println(squared);
    }
}
