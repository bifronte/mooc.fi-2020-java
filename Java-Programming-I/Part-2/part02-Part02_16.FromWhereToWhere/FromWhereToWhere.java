
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int numberTo = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Where from? ");
        int numberFrom = Integer.valueOf(scanner.nextLine());
        
        for(int i = numberFrom; i <= numberTo; i++){            
            System.out.println(i);
        }
    }
}
