/**
 *
 * @author bifronte
 */
import java.util.HashMap;

public class Abbreviations {
    private HashMap<String,String> map;
    
    public Abbreviations() {
        this.map = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {                
        if(this.hasAbbreviation(abbreviation)) {
            System.out.println("The abbreviation is in the list already");
        
        }else  {
            this.map.put(abbreviation, explanation);
        }
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return this.map.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        if(this.hasAbbreviation(abbreviation)) {
            return this.map.get(abbreviation);
            
        }
        
        return null;
    }
}
