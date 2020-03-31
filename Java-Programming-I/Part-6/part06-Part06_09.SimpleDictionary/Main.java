
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SimpleDictionary dictionary = new SimpleDictionary();
        Scanner reader = new Scanner(System.in);
        
        TextUI tui = new TextUI(reader, dictionary);
        
        tui.start();
    }
}
