
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        int countPositive = 0;
        int sum = 0;
        
        while(true){
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            }
            
            if(number > 0){
                countPositive = countPositive + 1;
                sum = sum + number;
            }
        }
        if(countPositive == 0){
            System.out.println("Cannot calculate the average");
        }else{
            double average = 1.0 *sum/countPositive;
            System.out.println(average);
        }
        
    }
}
