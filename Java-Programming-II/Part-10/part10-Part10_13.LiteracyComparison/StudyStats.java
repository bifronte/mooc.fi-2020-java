/**
 *
 * @author bifronte
 */
public class StudyStats implements Comparable<StudyStats>{
    private String gender;
    private String country;
    private int year;
    private double literacyPercent;
    
    public StudyStats(String country, int year, String gender, double literacyPercent) {
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }

    public int getYear() {
        return year;
    }
    
    public double getLiteracyPercent() {
        return literacyPercent;
    }
    
    public String toString() {
        return getCountry() + " (" + getYear() + "), " + getGender() + ", " + getLiteracyPercent();
    }

    @Override
    public int compareTo(StudyStats other) {
        if(this.literacyPercent > other.getLiteracyPercent()) {
            return 1;
        }
        else if(this.literacyPercent < other.getLiteracyPercent()) {
            return -1;
        }
        else {
            return 0;
        }
    }    
}
