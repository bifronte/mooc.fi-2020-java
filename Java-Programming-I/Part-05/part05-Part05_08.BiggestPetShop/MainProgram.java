
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Hulda", "Golden retriever");
        Person leo = new Person("Leo", hulda);
        
        Pet lala = new Pet("Lala", "Korat");
        Person red = new Person("Red", lala);

        System.out.println(red);
    }
}
