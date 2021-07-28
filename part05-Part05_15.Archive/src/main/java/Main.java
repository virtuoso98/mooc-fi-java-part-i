
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> itemsArr = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Item newItem = new Item(name, identifier);
            if (itemsArr.contains(newItem)) {
                // Item already present in array. Do nothing.
                System.out.println("Already on list");
            } else {
                itemsArr.add(newItem);
            }
        }
        
        System.out.println("==Items==");

        itemsArr.forEach((item) -> {
            System.out.println(item);
        });
    }
}
