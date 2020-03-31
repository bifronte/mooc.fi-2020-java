/**
 *
 * @author bifronte
 */
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> list;
    
    public Room() {
        this.list = new ArrayList<>();
    }
    
    public void add(Person person) {
        this.list.add(person);
    }
    
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.list;
    }
    
    public Person shortest() {
        if(isEmpty()) {
            return null;
        }
        
        Person shortest = this.list.get(0);
        
        for(Person person: list) {
            if(shortest.getHeight() > person.getHeight()) {
                shortest = person;
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        Person shortest = this.shortest();
        this.list.remove(this.shortest());
        
        return shortest;
    }
           
}
