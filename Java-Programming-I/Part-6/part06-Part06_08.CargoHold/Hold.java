/**
 *
 * @author bifronte
 */
import java.util.ArrayList;

public class Hold {
   
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
   
    public Hold(int maxWeight) {
       this.suitcases = new ArrayList<Suitcase>();
       this.maxWeight = maxWeight;
    }
   
    public void addSuitcase(Suitcase suitcase) {
        if(this.currentWeight() + suitcase.totalWeight() > this.maxWeight) {
            return;
        }
        this.suitcases.add(suitcase);
    }
    
    public int currentWeight() {
        int currentWeight = 0;
        
        for(Suitcase suitcase: this.suitcases) {
            currentWeight += suitcase.totalWeight();
        }
        
        return currentWeight;
    }
    
    public void printItems() {
        for(Suitcase suitcase: this.suitcases) {
            suitcase.printItems();
        }
    }
    
    public String toString() {
        if(this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        
        if(this.suitcases.size() == 1) {
            return "1 suitcase (" + currentWeight() + " kg)";
        }
        
        return this.suitcases.size() + " suitcases + (" + currentWeight() + " kg)";
    }
}
