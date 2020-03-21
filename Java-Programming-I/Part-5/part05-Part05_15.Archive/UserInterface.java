/**
 *
 * @author bifronte
 */
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    
    public void start() {
        Scanner reader = new Scanner(System.in);
        ArrayList<Item> archive = new ArrayList<>();
        
        while(true) {
            System.out.println("Identifier? (empty will stop) ");
            String identifier = reader.nextLine();
            
            if(identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop) ");
            String name = reader.nextLine();
            
            if(name.isEmpty()) {
                break;
            }
            
            Item item = new Item(identifier, name);
            
            if(!(archive.contains(item))) {
                archive.add(item);
            }else {
                System.out.println("The item is already on the archive.");
            }            
        }
        
        System.out.println("==Items==");
        for(Item item: archive) {
            System.out.println(item);
        }
    }
}
