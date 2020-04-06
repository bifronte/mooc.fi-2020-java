
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        // Checking if both share the same memory address
        if(this == compared) {
            return true;
        }
        
        // Checking if compared Object is Person type
        if(!(compared instanceof Person)) {
            return false;
        }
        
        // Casting the Object compared to Person type
        Person comparedPerson = (Person)compared;
        
        // Checking the equality of the atributes
        if(this.name.equals(comparedPerson.name) 
            && this.birthday.equals(comparedPerson.birthday)
            && this.height == comparedPerson.height
            && this.weight == comparedPerson.weight) {
            
            return true;
        }
        
        return false;        
    }
}
