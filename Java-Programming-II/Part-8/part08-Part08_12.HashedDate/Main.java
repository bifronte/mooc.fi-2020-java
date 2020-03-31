
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        HashMap<SimpleDate, String> map = new HashMap<>();
        SimpleDate myDate = new SimpleDate(18, 1, 1990);    
        
        map.put(myDate, "Xavier");
        map.put(new SimpleDate(15, 5, 1960), "Lala");
        
        System.out.println(map.get(myDate));
        System.out.println(map.get(new SimpleDate(18, 1, 1990)));
        System.out.println(map.get(new SimpleDate(15, 5, 1960)));
        
    }
}
