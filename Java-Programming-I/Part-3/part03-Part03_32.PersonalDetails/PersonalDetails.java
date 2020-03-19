
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;        
        String longestName = "";
                
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] array = input.split(",");
            int birthYear = Integer.valueOf(array[1]);
            count++;
            sum = sum + birthYear;
            
            // Getting the longest name
            String name = array[0];
            if(longestName.length() < name.length()){
                longestName = name; 
            }    
        }
        double average = 1.0*sum/count;
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
