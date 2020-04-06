/**
 *
 * @author bifronte
 */
import java.util.Scanner;


public class UserInterface {
    private Scanner reader;
    private TodoList list;    
    
    public UserInterface(TodoList list, Scanner reader) {
        this.list = list;
        this.reader = reader;        
    }
    
    public void start() {
        //The exercise don't allow to create more instances variables
        CommandManager cmanager = new CommandManager(this.list, this.reader);
        
        while(true) {
            System.out.print("Command: ");
            String command = reader.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            
            cmanager.give(command);
        }
    }
}
