
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        
        int smallest = 2147483647;
        for (int i = 0; i < list.size(); i++) {
            smallest = Math.min(smallest, list.get(i));
        }
        
        System.out.println("Smallest number: " + smallest);
        
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) == smallest) {
                System.out.println("Found at index: " + j);
            }
        }
    }
}
