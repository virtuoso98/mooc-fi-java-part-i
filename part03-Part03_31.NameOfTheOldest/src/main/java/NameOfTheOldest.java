
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        
        while (true) 
        {
            String input = scanner.nextLine();
            if (input.equals("")) 
            {
                break;
            }
            String[] pieces = input.split(",");
            int newAge = Integer.valueOf(pieces[1]);
            if (age < newAge) 
            {
                age = newAge;
                name = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
