
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date = new SimpleDate(12, 1, 1990);
        
        date.advance();
        System.out.println(date + "\n");
        date.advance(80);
        System.out.println(date + "\n");  
        
        SimpleDate futureDate = date.afterNumberOfDays(60);
        System.out.println(date);
        System.out.println(futureDate);
    }
}
