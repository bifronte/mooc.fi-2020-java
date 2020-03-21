
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Statistics statsSum = new Statistics();
        Statistics statsEven = new Statistics();
        Statistics statsOdd = new Statistics();
        
        System.out.println("Enter numbers:");
        
        while(true){            
            int number = Integer.valueOf(scanner.nextLine());
            if(number == -1){
                break;
            }
            
            //Checking if it is even
            if( number % 2 == 0){
                statsEven.addNumber(number);
            }else{
                statsOdd.addNumber(number);
            }
            
            statsSum.addNumber(number);            
        }
        
        System.out.println("Sum: " + statsSum.sum());
        System.out.println("Sum of even numbers: " + statsEven.sum());
        System.out.println("Sum of odd numbers: " + statsOdd.sum());
        
        
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
