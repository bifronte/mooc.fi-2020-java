/**
 *
 * @author shjel
 */
public class Exercise {
    private String exercise;
    private boolean completed;
    
    public Exercise(String exercise) {
        this.exercise = exercise;
        this.completed = false;
    }
    
    public String getName() {
        return this.exercise;
    }
    
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    
    public boolean isCompleted() {
        return this.completed;
    }
}
