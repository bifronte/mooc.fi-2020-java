/**
 *
 * @author bifronte
 */

import java.util.ArrayList;

public class BirdManager {
    private ArrayList<Bird> birds;
    
    public BirdManager() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(String name, String nameLatin) {
        birds.add(new Bird(name, nameLatin));
    }
    
    public void addObservation(String name) {
        for(Bird bird: birds)  {
            if(bird.getName().equals(name)) {
                bird.Observed();
            }
        }
    }
    
    public boolean isNameTrue(String name) {
        for(Bird bird: birds) {
            if(bird.getName().equals(name)) {
                return true;
            }
        }
        
        return false;
    } 
    
    public void printAll() {        
        for(Bird bird: birds) {
            System.out.println(bird);
        }
    }
    
    public void getBird(String name) {
        for(Bird bird: birds) {
            if(bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }
}
