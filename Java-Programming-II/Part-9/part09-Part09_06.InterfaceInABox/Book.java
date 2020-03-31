/**
 *
 * @author bifronte
 */

public class Book implements Packable{
    private String title;
    private String autor;    
    private double weight;
    
    public Book(String autor, String title, double weight) {
        this.title = title;
        this.autor = autor;
        this.weight = weight;               
    }

    @Override
    public double weight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.autor + ": " + this.title;
    }
    
}
