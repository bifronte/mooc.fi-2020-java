

public class MainProgram {

    public static void main(String[] args) {
        Herd herd = new Herd();
        
        herd.addToHerd(new Organism(2, 7));
        herd.addToHerd(new Organism(4, -5));
        herd.addToHerd(new Organism(13, 1));
        herd.addToHerd(new Organism(-5, 0));
        
        herd.move(10, 5);
        System.out.println(herd);
        
        
    }
}
