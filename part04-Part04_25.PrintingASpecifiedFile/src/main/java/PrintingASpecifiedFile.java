
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String file = scanInput.nextLine();
        
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception error) {
            System.out.println("Error: " + error.getMessage());
        }
    }
}
