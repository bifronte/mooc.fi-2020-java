/**
 *
 * @author bifronte
 */
public class Gift {
    private String name;
    private int weight;
    
    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
     @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
    
    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }
}
