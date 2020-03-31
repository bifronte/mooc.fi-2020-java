
public class Main {

    public static void main(String[] args) {
        Hold hold = new Hold(20);
        
        Suitcase suitcase = new Suitcase(8);
        Suitcase suitcase2 = new Suitcase(10);
        
        Item book = new Item("The Count of Montecristo", 2);
        Item screen = new Item("ZOWIE XL2411P", 3);
        Item keyboard = new Item("StrikeBattle", 1);
        Item brick = new Item("brick", 3);
        System.out.println("");             
        
        suitcase.addItem(book);
        suitcase.addItem(screen);
        suitcase.addItem(keyboard);
        
        suitcase2.addItem(book);
        suitcase2.addItem(screen);
        suitcase2.addItem(keyboard);
        suitcase2.addItem(brick);
        
        System.out.println("Suitcase");
        System.out.println(suitcase);
        System.out.println("");
        System.out.println("Suitcase2");
        System.out.println(suitcase2);
        
        hold.addSuitcase(suitcase);
        hold.addSuitcase(suitcase2);
        
        System.out.println("Hold:");
        System.out.println(hold);
        System.out.println("");
        
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
        
        
    }
    
    

}
