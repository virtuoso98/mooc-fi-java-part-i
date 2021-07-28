
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        Statistics statsTotal = new Statistics();
        Statistics statsEven = new Statistics();
        Statistics statsOdd = new Statistics();
        
        System.out.println("Enter numbers:");
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) 
            {
                break;
            }
            
            statsTotal.addNumber(input);
            
            if (input % 2 == 0) 
            {
                statsEven.addNumber(input);
            }
            else
            {
                statsOdd.addNumber(input);
            }
            
        }
        System.out.println("Sum: "  + statsTotal.sum());
        System.out.println("Sum of even numbers: " + statsEven.sum());
        System.out.println("Sum of odd numbers: " + statsOdd.sum());
    }
}
