

public class Main {

    public static void main(String[] args) {
        Hold hold = new Hold(15);
        Suitcase suitcase = new Suitcase(8);
        Suitcase suitcase2 = new Suitcase(8);        
        
        Item bleach = new Item("bleach", 1);
        Item mouse = new Item("mouse", 1);
        Item screen= new Item("screen", 3);
        Item brick= new Item("brick", 3);
        
        suitcase.addItem(bleach);
        suitcase.addItem(mouse);
        suitcase.addItem(screen);
        suitcase.addItem(brick);        
        System.out.println(suitcase + "\n");
        suitcase.printItems();
        
        suitcase2.addItem(bleach);
        suitcase2.addItem(mouse);
        suitcase2.addItem(screen);
        suitcase2.addItem(brick);
        System.out.println(suitcase + "\n");
        
        
        hold.addSuitcase(suitcase);
        hold.addSuitcase(suitcase2);
        
        System.out.println(hold);
        hold.printItems();
        
        
    }

}
