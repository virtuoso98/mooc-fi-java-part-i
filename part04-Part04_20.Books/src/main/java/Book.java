/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Book {
    private String title;
    private int pages;
    private int pubYear;
    
    public Book(String title, int pages, int pubYear) {
        this.title = title;
        this.pages = pages;
        this.pubYear = pubYear;
    }
    
    public String getAllInfo() {
        String output = this.title + ", " + this.pages + " pages, " + this.pubYear;
        return output;
    }
    
    public String getTitle() {
        return this.title;
    }
}
