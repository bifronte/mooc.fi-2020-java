
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try(Scanner fileReader = new Scanner(Paths.get(fileName))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                
                if(line.isEmpty()){
                    continue;
                }
                
                String[] array = line.split(",");
                String name = array[0];
                int age = Integer.valueOf(array[1]);
                
                if(!(age == 1)){
                    System.out.println(name + ", age: " + age + " years");
                }else{
                    System.out.println(name + ", age: " + age + " year");
                }
                
            }
        }
        catch(Exception e){
            System.out.println("Reading the file " + fileName + " failed.");
        }

    }
}
