
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1) {
                break;
            }
            
            list.add(number);                     
        }
        
        list.stream().filter(number -> number >= 1 && number <= 5)
                .forEach(value -> System.out.println(value));

    }
}
