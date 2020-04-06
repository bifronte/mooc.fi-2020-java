
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        Checker check = new Checker();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        
        if(check.timeOfDay(input) == true) {
            System.out.println("The form is correct");
        }else{
            System.out.println("The form is incorrect");
        }
        
    }
}
