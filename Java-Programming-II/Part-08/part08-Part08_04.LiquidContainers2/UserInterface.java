/**
 *
 * @author bifronte
 */

import java.util.Scanner;

public class UserInterface {
    private Scanner reader;    
    private Container first;
    private Container second;
    
    public UserInterface(Scanner reader) {
        this.reader = reader;    
        first = new Container();
        second = new Container();
    }
    
    public void start() {     
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = reader.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")) {
                first.add(amount);     
            }
            
            if(command.equals("move")) {                                
                if(amount > first.contains()) {
                    amount = first.contains();
                }
                first.remove(amount);
                second.add(amount);
                              
            }
            
            if(command.equals("remove")) {
                second.remove(amount);
            }
        }
    }
}
