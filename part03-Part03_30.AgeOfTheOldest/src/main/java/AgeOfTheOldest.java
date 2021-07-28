
import java.util.Scanner;
import java.lang.Math;
        
public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        
        while (true) 
        {
            String input = scanner.nextLine();
            if (input.equals("")) 
            {
                break;
            }
            String[] pieces = input.split(",");
            age = Math.max(age, Integer.valueOf(pieces[1]));
        }
        System.out.println("Age of the oldest: " + age);
    }
}
