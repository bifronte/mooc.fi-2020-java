/**
 *
 * @author bifronte
 */

import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private JokeManager jmanager;
    
    public UserInterface(JokeManager jmanager, Scanner reader) {
        this.reader = reader;
        this.jmanager = jmanager;                
    }
    
    public void start() {
        while(true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            
            String command = reader.nextLine();
            
            if(command.equals("X")) {
                break;
            }           
            
            commandManager(command);
            System.out.println("");
        }
    }
    
    public void commandManager(String command) {
        if(command.equals("1")) {
            System.out.println("Write the joke to be added:");
            String joke = reader.nextLine();
            
            jmanager.addJoke(joke);
            
        }else if(command.equals("2")) {
            System.out.println(jmanager.drawJoke());
            
        }else if(command.equals("3")) {
            jmanager.printJokes();
            
        }else{
            return;
        }
    }
}
