
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {        
        String fileName = "literacy.csv";    
        
        List<StudyStats> list = readFile(fileName);
        
        list.stream().forEach(value -> System.out.println(value));   
    }
    
    public static List<StudyStats> readFile(String fileName) {        
        
        try{
            return Files.lines(Paths.get(fileName))
                    .map(line -> line.split(","))      
                    // Creating a new StudyStats instance with the data that we need, trimming and parsing to Int when needed
                    .map(array -> new StudyStats(array[3], Integer.valueOf(array[4]), array[2].split(" ")[1], Double.valueOf(array[5])))   
                    .sorted() // Implemented Comparable in order to use sort()
                    .collect(Collectors.toList());
            
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return new ArrayList<>();
    }
}
