/**
 *
 * @author bifronte
 */
public class ContainerManager {
    private int[] containers;
    
    public ContainerManager(int[] containers) {
        this.containers = containers;
    }
    
    public void add(int amount) {      
        containers[0] += amount;
        
        if(containers[0] > 100) {
            containers[0] = 100;
        }        
    }
    
    public void move(int amount) {
        if(amount > containers[0]) {
            amount = containers[0];          
        }    
        
        containers[1] += amount;
        containers[0] -= amount;         
        
        if(containers[1] > 100) {
            containers[1] = 100;
        }          
    }
    
    public void remove(int amount) {
        containers[1] -= amount;
        
        if(containers[1] < 0) {
            containers[1] = 0;
        }
    }
    
    public String toString() {
        return "First: " + containers[0] + "/100\n" + 
               "Second: " + containers[1] + "/100";
    }
}
