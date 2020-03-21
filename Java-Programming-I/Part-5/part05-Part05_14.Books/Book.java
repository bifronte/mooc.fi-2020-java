
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared) {
        // Casting the Object type compared object
        Book comparedBook = (Book)compared;
        
        // True if the attributes values are the same
        return this.name.equals(comparedBook.name) && this.publicationYear == comparedBook.publicationYear;
            
            
    }

}
