
import java.util.HashSet;
import java.util.Set;



public class Main {

    public static void main(String[] args) {
        Set<String> capitals = new HashSet<>();
        
        capitals.add("Paris");
        capitals.add("Stockholm");
        capitals.add("Kinshasa");
        capitals.add("Stockholm");
        
        System.out.println(capitals.size());

    }

    public static int returnSize(Set set) {
        return set.size();
    }
    

}
