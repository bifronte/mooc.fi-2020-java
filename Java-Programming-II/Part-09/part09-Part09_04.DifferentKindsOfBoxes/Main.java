

public class Main {

    public static void main(String[] args) {
        MisplacingBox missedBox = new MisplacingBox();
        missedBox.add(new Item("pc", 5));
        missedBox.add(new Item("laptop", 3));
        missedBox.add(new Item("books", 5));
        
        System.out.println(missedBox.isInBox(new Item("pc")));
        System.out.println(missedBox.isInBox(new Item("laptop")));
        System.out.println(missedBox.isInBox(new Item("books")));
        
    }
}
