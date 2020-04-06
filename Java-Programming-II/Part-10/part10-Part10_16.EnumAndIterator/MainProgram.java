
import java.util.ArrayList;
import java.util.List;


public class MainProgram {

    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.add(new Person("Zaa", Education.HS));
        employees.add(new Person("Ree", Education.MA));
        employees.add(new Person("Tuu", Education.PHD));
        
        employees.print();
        System.out.println("");
        
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ukk", Education.MA));
        persons.add(new Person("Apa", Education.PHD));       
        employees.add(persons);
        
        employees.print();
        System.out.println("");
        
        employees.print(Education.PHD);
        System.out.println("");
        
        employees.fire(Education.HS);
        employees.print();
    }    
}
