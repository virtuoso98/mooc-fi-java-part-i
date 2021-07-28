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
    private SimpleDictionary simpleDict;
    
    public TextUI(Scanner scan, SimpleDictionary dict) {
        this.scanner = scan;
        this.simpleDict = dict;
    }
    
    public void start() {
        boolean shouldLoop = true;
        while (shouldLoop) {
            System.out.print("Command: ");
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "end":
                    System.out.println("Bye bye!");
                    shouldLoop = false;
                    break;
                case "add":
                    System.out.println("Word: ");
                    String wordInput = scanner.nextLine();
                    System.out.println("Translation: ");
                    String translationInput = scanner.nextLine();
                    simpleDict.add(wordInput, translationInput);
                    break;
                case "search":
                    System.out.println("To be translated: ");
                    String wordToTranslate = scanner.nextLine();
                    if (simpleDict.translate(wordToTranslate) == null)
                    {
                        System.out.println("Word " + wordToTranslate + " was not found");
                    } 
                    else 
                    {
                        System.out.println(simpleDict.translate(wordToTranslate));
                    }

                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
