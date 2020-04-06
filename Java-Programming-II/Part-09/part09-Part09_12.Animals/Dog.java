/**
 *
 * @author bifronte
 */

public class Dog extends Animal implements NoiseCapable {
    private String name;
    
    public Dog() {
        super("Dog");
    }    
    
    public Dog(String name) {
        super(name);        
    }    
    
    public void bark() {
        System.out.println(getClass() + " barks");
    }

    @Override
    public void makeNoise() {
        this.bark();
    }
}
