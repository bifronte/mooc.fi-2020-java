/**
 *
 * @author bifronte
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if(input.equals("stop")) {
                break;
            }
            
            if(input.equals("add")) {
                System.out.print("Task: ");
                String task = scanner.nextLine();
                this.list.add(task);
            }
            
            if(input.equals("list")) {
                list.print();
            }
            
            if(input.equals("remove")) {
                System.out.print("Which task was completed?: ");
                int taskNumber = Integer.valueOf(scanner.nextLine());
                list.remove(taskNumber);
            }
        }
    }
}
