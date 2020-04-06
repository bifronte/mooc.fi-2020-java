/**
 *
 * @author bifronte
 */
import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> items;
           
    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public void add(Packable item) {
        if(item.weight() <= this.capacity - weight()) {
            this.items.add(item);
        }
    }
    
    public double weight() {
        double currentWeight = 0;
        for(Packable item: this.items) {
            currentWeight += item.weight();
        }
        
        return currentWeight;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, " + "total weight " + weight() + " kg";
    }
}
