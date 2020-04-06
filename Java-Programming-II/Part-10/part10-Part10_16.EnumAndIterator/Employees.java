
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author bifronte
 */
public class Employees{
    private List<Person> employees;
    
    public Employees() {
        employees = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(person -> employees.add(person));
    }
    
    public void print() {
        Iterator<Person> iterator =  employees.iterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator =  employees.iterator();
        
//        employees.stream()
//                .filter(value -> value.getEducation() == education)
//                .forEach(value -> System.out.println(value));
        
        while(iterator.hasNext()) {
            Person nextPerson = iterator.next();
            
            if(nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }   
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        
        while(iterator.hasNext()) {
            if(iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
