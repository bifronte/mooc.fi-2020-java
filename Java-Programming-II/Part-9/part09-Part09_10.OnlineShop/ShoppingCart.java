/**
 *
 * @author bifronte
 */

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String,Item> contents;
    
    public ShoppingCart() {
        this.contents = new HashMap<>();
    }
    
    // If the item is already in the cart, we just increase its cuantity
    public void add(String product, int price) {
        // we set the quantity to 0 while creating the new Item because right after we
        // increase its cuantity by one
        this.contents.putIfAbsent(product, new Item(product, 0, price));
        this.contents.get(product).increaseQuantity();
    }
    
    public int price() {
        int priceSum = 0;
        
        for(Item item: this.contents.values()) {
            priceSum += item.price();
        }
        
        return priceSum;
    }
    
    public void print() {
        for(Item item: this.contents.values()) {
            System.out.println(item);
        }
    }
}
