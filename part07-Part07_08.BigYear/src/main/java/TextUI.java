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
public class TextUI {
    private Scanner scanner;
    private BirdDatabase birds;
    
    public TextUI(Scanner scanner, BirdDatabase birdlist) {
        this.scanner = scanner;
        this.birds = birdlist;
    }
    
    public void start() {
        boolean shouldLoop = true;
        
        try {
            while (shouldLoop) {
                System.out.println("? ");
                String cmd = this.scanner.nextLine();
                switch (cmd) {
                    case "Add":
                        System.out.print("Name ");
                        String name = this.scanner.nextLine();
                        System.out.print("Name in Latin ");
                        String latinName = scanner.nextLine();
                        this.birds.addBird(new Bird(name, latinName));
                        break;
                    case "Observation":
                        name = scanner.nextLine();
                        this.birds.addObservationFromDB(name);
                        break;
                    case "All":
                        this.birds.printBirdDatabase();
                    case "One":
                        name = this.scanner.nextLine();
                        this.birds.printBird(name);
                        break;
                    case "Quit":
                        shouldLoop = false;
                        break;
                    default:
                        System.out.println("Unknown Command");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
