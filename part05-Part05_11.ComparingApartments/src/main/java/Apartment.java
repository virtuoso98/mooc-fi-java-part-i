
import java.lang.Math;

public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int squares() {
        return this.squares;
    }
    
    public int rooms() {
        return this.rooms;
    }
    
    public int pricePerSquare() {
        return this.princePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return this.squares() > compared.squares();
    }
    
    public int getPrice() {
        return this.squares() * this.pricePerSquare();
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(compared.getPrice() - this.getPrice());
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        return this.getPrice() > compared.getPrice();
    }
}
