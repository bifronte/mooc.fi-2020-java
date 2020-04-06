
import java.util.HashMap;
import java.util.Map;

public class MainProgram {

    public static void main(String[] args) {
        Map<String,Integer> people = new HashMap<>();
        
        people.put("Xavier", 27);
        people.put("Carles", 30);
        people.put("Jul", 25);
        
        System.out.println(people.size());
    }
    
    public static int returnSize(Map map) {
        return map.size();
    }
    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
}
