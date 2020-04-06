
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        JokeManager jmanager = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        
        UserInterface ui = new UserInterface(jmanager, scanner);
        
        ui.start();
    }
}
