
public class Main {

    public static void main(String[] args) {
        SimpleDate myDate = new SimpleDate(12, 11, 1994);
        SimpleDate anotherDate = new SimpleDate(12, 11, 1994);
        SimpleDate yetAnotherDate = myDate;
        
        System.out.println(myDate.equals(anotherDate));
        System.out.println(myDate.equals("lala"));
        System.out.println(myDate.equals(yetAnotherDate));
    }
}
