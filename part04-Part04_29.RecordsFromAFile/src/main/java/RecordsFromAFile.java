
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file");
        String file = scanner.nextLine();
        
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()) {
                String input = fileScan.nextLine();
                String[] arrInput = input.split(",");
                String output = arrInput[0] + ", age: " + arrInput[1] + " year";
                if (Integer.valueOf(arrInput[1]) != 1) {
                    output += "s";
                }
                System.out.println(output);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
