import java.util.ArrayList;
import java.util.List;

public class mainProgram {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        
        name.add("Xavi");
        name.add("Pandora");
        name.add("Luis");
        
        System.out.println(returnSize(name));
    }

    public static int returnSize(List<String> list) {
        return list.size();
                
    }
}
