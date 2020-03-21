
public class MainProgram {

    public static void main(String[] args) {
        Money wallet = new Money(1, 0);
        System.out.println(wallet + "\n");
        
        Money wallet2 = new Money(1, 50);
        System.out.println(wallet2 + "\n");
        
        Money wallet3 = new Money(-3, 5);
        System.out.println(wallet2 + "\n");
        
        Money wallet4 = new Money(2, 0);
        System.out.println(wallet2 + "\n");
        
        System.out.println(wallet.lessThan(wallet2));
        
    }
}
