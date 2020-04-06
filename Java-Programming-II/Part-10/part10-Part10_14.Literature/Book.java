/**
 *
 * @author bifronte
 */

public class Book implements Comparable<Book>{
    private String title;
    private int ageRecommendation;
    
    public Book(String title, int ageRecommendation) {
        this.title = title;
        this.ageRecommendation = ageRecommendation;
    }  

    public String getTitle() {
        return title;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    @Override
    public int compareTo(Book other) {
        return this.ageRecommendation - other.getAgeRecommendation();
    }
    
    @Override
    public String toString() {
       return this.title + "(recommended for " +this.ageRecommendation + " years-old or older)";
    }
    
    
}
