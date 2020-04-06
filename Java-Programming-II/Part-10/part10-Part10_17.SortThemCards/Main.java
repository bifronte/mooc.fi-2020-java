
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {

    public static void main(String[] args) {
        Hand hand1 = new Hand();
        hand1.add(new Card(2, Suit.DIAMOND));
        hand1.add(new Card(14, Suit.SPADE));
        hand1.add(new Card(12, Suit.HEART));
        hand1.add(new Card(6, Suit.SPADE));
        
        System.out.println("Hand 1:");
        hand1.sort();
        hand1.print();
        System.out.println("");
        
        Hand hand2 = new Hand();    
        hand2.add(new Card(2, Suit.DIAMOND));
        hand2.add(new Card(10, Suit.SPADE));
        hand2.add(new Card(12, Suit.HEART));
        hand2.add(new Card(7, Suit.SPADE));
        
        System.out.println("Hand 2:");
        hand2.sort();
        hand2.print();
        System.out.println("");
        
//        int comparison = hand1.compareTo(hand2);
//
//        if (comparison < 0) {
//            System.out.println("better hand is");
//            hand2.print();
//        } else if (comparison > 0){
//            System.out.println("better hand is");
//            hand1.print();
//        } else {
//            System.out.println("hands are equal");
//        }
        System.out.println("Comparing by suit, if equals then by value");
        Collections.sort(hand2.getCards(), new BySuitInValueOrder());
        hand2.print();
        System.out.println("");
        
        System.out.println("Comparing by suit, if equals then by value");
        hand1.sortBySuit();
        hand1.print();
        

        
    }
}
