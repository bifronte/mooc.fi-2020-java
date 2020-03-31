/**
 *
 * @author Bifronte
 */

public class Bird {
    private String name;
    private String nameLatin;
    private int timesObserved;
    
    public Bird(String name, String nameLatin) {
        this.name = name;
        this.nameLatin = nameLatin;
        this.timesObserved = 0;
    }    
    
    public void Observed() {
        this.timesObserved++;
    }
    
    public int getTimesObserved() {
        return this.timesObserved;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + "(" + this.nameLatin + "): " + this.timesObserved + " observations"; 
    }
}
