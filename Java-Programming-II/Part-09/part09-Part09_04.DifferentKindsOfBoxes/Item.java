
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        
        if(!(obj instanceof Item)) {
            return false;
        }
        
        Item comparedItem = (Item) obj;
        
        return this.name.equals(comparedItem.name);
    }

    @Override
    public int hashCode() {
        int itemHashcode = this.name.hashCode();
        return itemHashcode;
    }
    
    
}
