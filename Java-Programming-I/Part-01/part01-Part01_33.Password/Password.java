
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String password = "Caput Draconis";
        System.out.println("Password?");
        String answer = scan.nextLine();
        
        if(password.equals(answer)){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
    }
}
