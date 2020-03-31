/**
 *
 * @author bifronte
 */

import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private ContainerManager cmanager;
    private int[] containers;
    
    public UserInterface(Scanner reader) {
        this.reader = reader;
        int[] containers = {0, 0};
        cmanager = new ContainerManager(containers);  
    }
    
    public void start() {     
        while (true) {
            System.out.println(cmanager);
            System.out.print("> ");

            String input = reader.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add") && amount > 0) {
                cmanager.add(amount);     
            }
            
            if(command.equals("move") && amount > 0) {
                cmanager.move(amount);
            }
            
            if(command.equals("remove") && amount > 0) {
                cmanager.remove(amount);
            }
        }
    }
    
}
