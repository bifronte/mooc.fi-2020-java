/**
 *
 * @author bifronte
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String,Integer> productNPrice;
    private Map<String,Integer> productNStock;    
    
    public Warehouse() {
        this.productNPrice = new HashMap<>();
        this.productNStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.productNPrice.put(product, price);
        this.productNStock.put(product, stock);
    }
    
    public int price(String product) {
        return this.productNPrice.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return this.productNStock.getOrDefault(product, 0);
    }
    
    public boolean take(String product)  {
        if(!this.productNStock.containsKey(product) || this.productNStock.get(product) == 0) {
            return false;
        }
        
        int newStockValue = this.productNStock.get(product) - 1;
        this.productNStock.put(product, newStockValue);
        return true;        
    }
    
    public Set<String> products() {
        Set<String> productNames = this.productNPrice.keySet();
        return productNames;
    }
}
