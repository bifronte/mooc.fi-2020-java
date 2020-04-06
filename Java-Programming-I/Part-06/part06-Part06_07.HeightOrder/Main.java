
public class Main {

    public static void main(String[] args) {
        Room backstage = new Room();
        
        Person xavi = new Person("Xavi", 170);
        Person malik = new Person("Malik", 178);
        Person grace = new Person("Grace", 185);
        Person kajsa = new Person("Kajsa", 173);
        
        backstage.add(xavi);
        backstage.add(malik);
        backstage.add(grace);
        backstage.add(kajsa);
        System.out.println("");
        
        for(Person person: backstage.getPersons()) {
            System.out.println(person);
        }
        System.out.println("Shortest: " + backstage.take());
        
        for(Person person: backstage.getPersons()) {
            System.out.println(person);
        }
        
        
        
    }
}
