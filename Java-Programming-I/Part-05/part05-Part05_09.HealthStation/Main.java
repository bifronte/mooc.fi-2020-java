
public class Main {

    public static void main(String[] args) {
        HealthStation clinic = new HealthStation();
        
        Person theresa = new Person("Theresa", 20, 170, 60);
        Person  cory = new Person("Cory", 25, 170, 75);
        
        System.out.println(theresa.getName() + " weight: " + clinic.weigh(theresa) + " kg.");
        System.out.println(cory.getName() + " weight: " + clinic.weigh(cory) + " kg.");     
        
        clinic.feed(cory);
        clinic.feed(cory);
        System.out.println(cory.getName() + " weight: " + clinic.weigh(cory) + " kg.");     
        
        clinic.feed(theresa);
        clinic.feed(theresa);
        clinic.feed(theresa);
        clinic.feed(theresa);
        System.out.println(theresa.getName() + " weight: " + clinic.weigh(theresa) + " kg."); 
        
        System.out.println("This clinic has performed " + clinic.weighings() + " weighings.");
        
    }
}
