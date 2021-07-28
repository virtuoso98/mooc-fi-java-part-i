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
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if (item.getWeight() + this.totalWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }
    
    public int totalWeight() {
        int total = 0;
        for (Item item: this.items) {
            total += item.getWeight();
        }
        return total;
    }   
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        int heaviest = -1;
        Item chosen = this.items.get(0);
        for (Item item : this.items) {
            if (heaviest < item.getWeight()) {
                chosen = item;
                heaviest = item.getWeight();
            }
        }
        return chosen;
    }
    
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (this.items.size() == 1) {
            int weight = this.items.get(0).getWeight();
            return "1 item " + "(" + weight + " kg)";
        }
        
        int currWeight = 0;
        for (Item item : this.items) {
            currWeight += item.getWeight();
        }
        
        return this.items.size() + " items " + "(" + currWeight + " kg)";
    }
}
