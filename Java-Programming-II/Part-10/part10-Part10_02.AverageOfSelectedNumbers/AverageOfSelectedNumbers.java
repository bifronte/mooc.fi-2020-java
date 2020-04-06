
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while(true) {            
            String input = scanner.nextLine();
            
            if(input.equals("end")) {
                break;
            }
            
            list.add(Integer.valueOf(input));
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        
        if(input.equals("p")) {
            double averagePositive = list.stream()                    
                    .mapToInt(i -> i)
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            
            System.out.println(averagePositive);
        }
        else if(input.equals("n")) {
            double averageNegative = list.stream()
                    .mapToInt(i -> i)
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            
            System.out.println(averageNegative);
        }
    }
}
