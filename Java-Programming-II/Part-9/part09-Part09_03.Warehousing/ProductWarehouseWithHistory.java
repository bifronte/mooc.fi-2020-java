/**
 *
 * @author bifronte
 */

public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;    
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        history = new ChangeHistory();
        addToWarehouse(initialBalance);
    }
    
    public String history() {
        return history.toString();
    }
    
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double amountToReturn = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        
        return amountToReturn;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history.toString());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        String strAverage = String.format("%.1f", history.average());
        System.out.println("Average: " + strAverage);
    }
}
