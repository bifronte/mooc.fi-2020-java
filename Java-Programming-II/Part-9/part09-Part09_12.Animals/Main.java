
public class Main {

    public static void main(String[] args) {
        NoiseCapable cat = new Cat();
        cat.makeNoise();
        
        NoiseCapable dog = new Dog();
        dog.makeNoise();
        
        NoiseCapable doggie = new Dog("Lucas");
        doggie.makeNoise();
        
        Dog d = (Dog) doggie;
        d.makeNoise();
        

    }

}
