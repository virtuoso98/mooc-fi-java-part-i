/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class TextInterface {

    private Scanner scanner;
    private GradeBook gradeBook;

    public TextInterface(Scanner scanner, GradeBook gradeBook) {
        this.gradeBook = gradeBook;
        this.scanner = scanner;
    }

    public void start() {
        boolean shouldLoop = true;
        System.out.println("Enter points total, -1 stops:");
        while (shouldLoop) {
            int gradePoint = Integer.valueOf(scanner.nextLine());
            if (gradePoint == -1) {
                gradeBook.printGrades();
                shouldLoop = false;
            } else{
                gradeBook.addGrade(gradePoint);
            }
        }
    }
}
