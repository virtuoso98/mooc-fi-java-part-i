import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String title = scanner.nextLine();
            if (title.isEmpty()){
                break;
            } 
            int pages = Integer.valueOf(scanner.nextLine());
            int pubYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(title, pages, pubYear));
        }
        
        System.out.println("What information will be printed? ");
        String filter = scanner.nextLine();
        
        
        for (Book book : books) {
            switch (filter) {
                case "everything":
                    System.out.println(book.getAllInfo());
                    break;
                case "name":
                    System.out.println(book.getTitle());
                    break;
                default:
                    break;
            }   
        }
    }
}
