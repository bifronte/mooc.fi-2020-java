
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        
        map.put("Matthew", "matt");
        map.put("Michael", "mix");
        map.put("Arthur", "artie");
        
        System.out.println(map.get("Matthew"));
    }

}
