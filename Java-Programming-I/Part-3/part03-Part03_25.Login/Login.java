
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPwd = scanner.nextLine();        
        
        
        // Better use ArrayList
        String[] usernames = {"alex", "emma"};
        String[] passwords = {"sunshine", "haskell"};
        
        boolean logged = false;
        int i = 0;
        while(i < usernames.length){
            if(usernames[i].equals(inputUsername) && passwords[i].equals(inputPwd)){
                System.out.println("You have succesfully logged in!");
                logged = true;
            }
            i++;
        }
        if(!logged){
            System.out.println("Incorrect username or password!");
        }
        
        
    }
}
