/**
 *
 * @author bifronte
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cards;
    
    public Hand() {
        cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        cards.add(card);
    }
    
    public void print() {
        cards.stream().forEach(card -> System.out.println(card));
    }
    
    public void sort() {
        Collections.sort(cards);
    }
    
    public List<Card> getCards() {
        return cards;
    }
    
    public int getValuesSum() {
        int sum = cards.stream()
                .map(card -> card.getValue())
                .reduce(0, (previousSum, card) -> previousSum + card);
        
        return sum;
    }

    @Override
    public int compareTo(Hand other) {
        return this.getValuesSum() - other.getValuesSum();
    }
    
    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }
}