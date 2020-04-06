/**
 *
 * @author bifronte
 */
public class Item {
    private String identifier;
    private String name;
    
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object compared) {
        // No need to check if both objects have the same memory address, since we know they don't
        // No need to check if both objects are the same type, since we know they are 
        
        // Casting the Object type compared object
        Item comparedItem = (Item)compared;
        
        // Checking if the attribues values are the same
        return this.identifier.equals(comparedItem.identifier);
          
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
}
