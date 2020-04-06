
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String bookName= scanner.nextLine();
            
            if(bookName.isEmpty()) {
                break;
            }
            
            System.out.print("Input the age recommendation: ");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());

            books.add(new Book(bookName, ageRecommendation));
        }
        
        System.out.println(books.size() + " books in total.");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getTitle);           
        
        
        System.out.println("Books:");
        books.stream().sorted(comparator)
                .forEach(value -> System.out.println(value));
    }
}
