
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        list.add(-4);
        list.add(-6);
        list.add(8);
        list.add(-9);
        list.add(7);
        list.add(5);

        System.out.println(positive(list));
    }
    
    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> positiveNumbers = numbers.stream()
                .filter(i -> i > 0)                
                .collect(Collectors.toList());
        
        return positiveNumbers;
    }

}
