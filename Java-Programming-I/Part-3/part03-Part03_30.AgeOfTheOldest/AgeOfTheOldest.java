
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;

        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] array = input.split(",");
            // Transform string to integer 
            int age = Integer.valueOf(array[1]);
            if(oldest < age){
                oldest = age;
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);
    }
}
