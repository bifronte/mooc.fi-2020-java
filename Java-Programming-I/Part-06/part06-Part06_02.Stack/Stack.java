import java.util.ArrayList;
/**
 *
 * @author bifronte
 */
public class Stack {
    
    private ArrayList<String> strings;   
    
    public Stack() {
        this.strings = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.strings.isEmpty();
    }
    
    public void add(String value) {
        this.strings.add(value);
    }
    
    public ArrayList<String> values() {
        return this.strings;
    }   
    
    public String take() {
             
        int i = this.strings.size() - 1;
        
        String toReturn = this.strings.get(i);
        this.strings.remove(i);
        
        return toReturn;
    }
}
