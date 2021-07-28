/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class BirdDatabase {
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(Bird bird) {
        this.birds.add(bird);
    }
    
    public void printBirdDatabase() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }
    
    public void printBird(String name){
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }
    }
    
    public void addObservationFromDB(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().toLowerCase().equals(name.toLowerCase())) {
                bird.addObservation();
            }
        }
    }
}
