/**
 *
 * @author bifronte
 */
import java.util.HashMap;
import java.util.Scanner;

public class TextUI {
    private Scanner reader;
    private SimpleDictionary dictionary;    
    
    public TextUI(Scanner reader, SimpleDictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;        
    }
    
    public void start() {
        
        while(true) {
            System.out.print("Command: ");
            String command = this.reader.nextLine();
            
            String whatNext = CommandManager(command);
            
            if(whatNext.equals("break")){
                break;
            }       
        }    
    }
    
    public String CommandManager(String command) {
        
        if(command.equals("end")) {
            System.out.println("Bye bye!");
            return "break";
        }else if(command.equals("add")) {
            this.add();
            
        }else if(command.equals("search")){                     
            
            this.search();
            
        }else {
            System.out.println("Unknown command");
        }
        
        return "";
    }
    
    public void search() {      
        System.out.print("To be translated: ");
        String word = reader.nextLine();   
        
        if(this.dictionary.translate(word) == null) {            
            System.out.println("Word " + word + " was not found");
            
        }else {            
            System.out.println("Translation " + this.dictionary.translate(word));  
        }        
    }
    
    public void add() {
        System.out.print("Word:");
        String word = reader.nextLine();
                
        System.out.print("Translation:");
        String translation = reader.nextLine();
                
        dictionary.add(word, translation);
    }
}
