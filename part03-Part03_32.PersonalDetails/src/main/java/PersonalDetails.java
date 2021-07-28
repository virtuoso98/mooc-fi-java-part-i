
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int longest = 0;
        String name = "";
        
        while (true) 
        {
            String input = scanner.nextLine();
            if (input.equals("")) 
            {
                break;
            }
            String[] pieces = input.split(",");
            String newName = pieces[0];
            if (longest < newName.length()) 
            {
                longest = newName.length();
                name = newName;
            }
            count += 1;
            total += Integer.valueOf(pieces[1]);
        }
        System.out.println("Longest name: " + name);
        double average = (double) total / count;
        System.out.println("Average of the birth years: " + average);

    }
}
