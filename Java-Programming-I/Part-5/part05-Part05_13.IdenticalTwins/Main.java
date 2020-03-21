
public class Main {

    public static void main(String[] args) {
        SimpleDate date1 = new SimpleDate(11, 2, 1990);
        SimpleDate date2 = new SimpleDate(12, 2, 1990);
        
        Person toto = new Person("Toto", date1, 169, 65);
        Person lala = new Person("Lala", date2, 180, 70);
        
        Person fatToto = new Person("Toto", date1, 169, 80);
        
        System.out.println("Is lala the same person as toto?? " + toto.equals(lala));
        System.out.println("Is fatToto the same person as toto?? " + fatToto.equals(toto));
        
    }
}
