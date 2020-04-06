
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        
        removeLast(list);
        System.out.println(list);
        
    }
    
    public static void removeLast(ArrayList<String> string){
        if(string.size() == 0) {
            return;
        }
        
        string.remove(string.size()-1);   
    }
}
