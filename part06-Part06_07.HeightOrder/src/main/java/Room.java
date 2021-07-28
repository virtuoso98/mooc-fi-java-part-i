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
public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
         if (this.isEmpty()) {
             return null;
         }
         
         int shortestHeight = Integer.MAX_VALUE;
         Person shortest = this.persons.get(0);
         
         for (Person person : this.getPersons()) {
             if (person.getHeight() < shortestHeight) {
                 shortest = person;
                 shortestHeight = person.getHeight();
             }
         }
         
         return shortest;
    }
    
    public Person take() {
        Person taken = this.shortest();
        this.persons.remove(taken);
        return taken;
    }
}
