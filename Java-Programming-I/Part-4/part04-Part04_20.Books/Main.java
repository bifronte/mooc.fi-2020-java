import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.print("Title: ");
            String title = reader.nextLine();
            if(title.isEmpty()){
                System.out.println("");
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(reader.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(reader.nextLine());
            //Adding a new Book object to our list
            books.add(new Book(title, pages, year));
            
        }        
        System.out.print("What information will be printed? ");
        String input = reader.nextLine();
        if(input.equals("everything")){
            for(Book book: books){
                System.out.println(book);
            }
        }
        if(input.equals("name")){
            for(Book book: books){
                System.out.println(book.getTitle());
            }
        }        
    }
}
