/**
 *
 * @author bifronte
 */
public class Book {
    private String title;
    private int numOfPages;
    private int publicationYear;
    
    public Book(String title, int pages, int year){
        this.title = title;
        this.numOfPages = pages;
        this.publicationYear = year;                
    }
    
    public String getTitle(){
        return this.title;
    }
    
    @Override
    public String toString(){
        return getTitle() + ", " + this.numOfPages + " pages, " + this.publicationYear;
    }
}
