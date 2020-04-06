
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReadingFilesPerLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file's name: ");
        String fileName = scanner.nextLine();
        
        System.out.println(read(fileName));

    }
    
    public static List<String> read(String file) {
               
        try{
            return Files.lines(Paths.get(file))
                    .collect(Collectors.toList());
        }
        catch(Exception e){
            System.out.println("Error: " + e.getStackTrace());
        }
        
        return new ArrayList<String>();
    }

}
