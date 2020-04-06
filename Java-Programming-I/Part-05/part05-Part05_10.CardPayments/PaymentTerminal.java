
import sun.font.EAttribute;


public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private static final double AFFORDABLE_PRICE = 2.5;
    private static final double HEARTY_PRICE = 4.3;

    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment < this.AFFORDABLE_PRICE) {
            return payment;
        }
        affordableMeals++;
        this.money+= AFFORDABLE_PRICE;
        return payment - AFFORDABLE_PRICE;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment < HEARTY_PRICE) {
            return payment;
        }
        heartyMeals++;
        this.money+= HEARTY_PRICE;
        return payment - HEARTY_PRICE;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        //if TRUE is returned, then the price has already been taken from the card
        //No need to card.takeMoney(PRICE) again
        if(card.takeMoney(AFFORDABLE_PRICE)) {
            affordableMeals++;
            return true;
        }        
        return false;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        //if TRUE is returned, then the price has already been taken from the card
        //No need to card.takeMoney(PRICE) again
        if(card.takeMoney(HEARTY_PRICE)) {
            heartyMeals++;
            return true;
        }
        return false;
    }
    
    public void addMoneyToCard(PaymentCard card, double amount) {
        if(amount < 0) {
            return;
        }
        card.addMoney(amount);
        this.money+= amount;
    }
    
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
