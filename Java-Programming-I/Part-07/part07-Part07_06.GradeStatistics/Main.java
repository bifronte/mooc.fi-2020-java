
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = "50\n" + "51\n" + "52\n" + "72\n" + "80\n" + "52\n" + "-1\n"; //"72\n"+ "80\n" + "52\n" + "-1\n";
        
        Scanner scanner = new Scanner(input);
        PointManager pmanager = new PointManager();
        UserInterface ui = new UserInterface(scanner, pmanager);
        
        ui.start();
        
    }
}
