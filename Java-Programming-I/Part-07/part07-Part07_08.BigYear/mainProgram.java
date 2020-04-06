
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        String input = "Add\n" + "Miau\n" + "Chanus Chanus\n" +"Add\n" + "Crow\n" + "Corvus Corvus\n" + "Add\n" + "Hawk\n" + "Dorkus Dorkus\n" + "Observation\n" + 
                       "Hawk\n" + "Observation\n" + "Lion\n" + "Observation\n" + "Hawk\n" + "All\n" + "One\n" + "Hawk\n"+ "Quit";
        
        String input2 = "Add\n" + "XXX\n" + "YYY\n" + "One\n" + "XXX\n" + "Quit";
        
        Scanner scan = new Scanner(System.in);
        BirdManager bmanager = new BirdManager();
        
        UserInterface ui = new UserInterface(scan, bmanager);        
        ui.start();
    }
}
