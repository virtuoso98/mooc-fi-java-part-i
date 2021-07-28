/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author user
 */
public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner) {
        this.scanner = scanner;
        this.manager = manager;
    }
    
    public void start() {
        boolean isLoop = true;
        String landing = "Commands:\n" + "1 - add a joke\n"  + "2 - draw a joke\n" + "3 - list jokes\n" + "X - stop";
        while (isLoop) {
            System.out.println(landing);
            String cmd = this.scanner.nextLine();
            switch (cmd) {
                case "X":
                    isLoop = false;
                    break;
                case "1":
                    System.out.println("Write the joke to be added:");
                    String joke = this.scanner.nextLine();
                    this.manager.addJoke(joke);
                    break;
                case "2":
                    System.out.println(this.manager.drawJoke());
                    break;
                case "3":
                    System.out.println("Printing the jokes.");
                    this.manager.printJokes();
                default:
                    System.out.println("Unknown"); 
                    break;
            }
        }
    }
}
