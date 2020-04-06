
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {    
        
//        String input = "recipes.txt\n" + "list\n" +  "find name\n" + "roll\n" + 
//                       "find cooking time\n" + "30\n" + "find cooking time\n" + 
//                       "15\n" + "stop";
        
        Scanner reader = new Scanner(System.in);        
        UserInterface ui = new UserInterface(reader);
        
        ui.start();
    }
}
