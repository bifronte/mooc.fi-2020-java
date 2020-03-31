/**
 *
 * @author bifronte
 */

import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> items;
    private int maxWeight;    
    
    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }    
    
    public int currentWeight() {
        int currentWeight = 0;
        for(Item item: items) {
            currentWeight += item.getWeight();
        }
        
        return currentWeight;
    }
    
    @Override
    public void add(Item item) {
        if(item.getWeight() <= maxWeight - currentWeight()) {
            this.items.add(item);            
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
            
    

    
    
}
