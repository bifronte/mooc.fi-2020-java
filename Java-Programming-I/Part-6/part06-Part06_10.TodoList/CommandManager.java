/**
 *
 * @author bifronte
 */
import java.util.Scanner;

public class CommandManager {
    private Scanner reader;
    private TodoList list;
    
    public CommandManager(TodoList list,Scanner reader) {
        this.reader = reader;
        this.list = list;
    }
    
    public void give(String command) {
        if(command.equals("add")) {
            add();
            
        }else if(command.equals("list")) {
            this.list.print();
            
        }else if(command.equals("remove")) {
            remove();
        }
    }
    
    public void add() {
        System.out.print("To add: ");
        String task = reader.nextLine();
        this.list.add(task);
    }
    
    public void remove() {
        System.out.print("Which one is removed? ");
        int toRemove = Integer.valueOf(this.reader.nextLine());
        this.list.remove(toRemove);
    }
}
