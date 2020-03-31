/**
 *
 * @author bifronte
 */
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        items = new ArrayList<Item>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if(totalWeight() + item.getWeight() > this.maxWeight) {
            return;
        }
        
        this.items.add(item);
    }

    public int totalWeight() {
        int currentWeight = 0;
        for(Item item: items) {
            currentWeight += item.getWeight();
        }
        
        return currentWeight;
    }
    
    public void printItems() {
        if(items.isEmpty()) {
            System.out.println("The suitcase is empty.");
        }
        
        for(Item item: this.items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        for(Item item: this.items) {
            if(heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }
        
        return heaviestItem;        
    }
    
    public String toString() {
        
        if(items.isEmpty()) {
           return "no items (0kg)";
        }
        
        if(items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)"; 
        }
        
        return this.items.size() + " items (" + totalWeight() + " kg)"; 
               
    }
    
}
