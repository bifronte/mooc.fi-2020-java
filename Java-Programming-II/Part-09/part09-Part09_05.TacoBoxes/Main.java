
public class Main {

    public static void main(String[] args) {
        TripleTacoBox tripleBox = new TripleTacoBox();
        tripleBox.eat();
        tripleBox.eat();
        System.out.println("Tacos remaining... " + tripleBox.tacosRemaining());
        tripleBox.eat();
        tripleBox.eat();
        System.out.println("Tacos remaining... " + tripleBox.tacosRemaining());
        
        CustomTacoBox customBox = new CustomTacoBox(7);
        customBox.eat();
        customBox.eat();
        customBox.eat();
        System.out.println("Tacos remaining... " + customBox.tacosRemaining());
    }
}
