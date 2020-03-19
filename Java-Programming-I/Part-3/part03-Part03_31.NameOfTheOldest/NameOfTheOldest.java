
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = "";
        int oldest = 0;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] array = input.split(",");
            int age = Integer.valueOf(array[1]);
            
            if(oldest < age){
                oldest = age;
                name = array[0];
            }            
        }
        System.out.println("Name of the oldest: " + name);
    }
}
