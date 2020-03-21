
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object compared) {
        // We check if they share the same memory address
        if(this == compared) {
            return true;
        }
        
        // Checking if the object is Song type, if not, they are not equals
        if(!(compared instanceof Song)) {
            return false;
        }
        
        // Converting the Object type compared object
        Song comparedSong = (Song)compared;
        
        // Checking if the values are the same
        if(this.artist.equals(comparedSong.artist) &&
           this.name.equals(comparedSong.name) &&
           this.durationInSeconds == comparedSong.durationInSeconds) {
            
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
