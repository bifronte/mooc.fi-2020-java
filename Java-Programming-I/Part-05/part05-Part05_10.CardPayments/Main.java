
public class Main {

    public static void main(String[] args) {
        PaymentCard uniCard = new PaymentCard(5);
        PaymentTerminal register = new PaymentTerminal();
        
        uniCard.addMoney(25);
        System.out.println("Card balance: " + uniCard.balance() + "\n");
        
//        System.out.println(register);
//        double change = register.eatAffordably(3);
//        System.out.println("Remaining change: " + change);
//        System.out.println(register + "\n");

        
        System.out.println("Enough money in the card? " + register.eatHeartily(uniCard));        
        System.out.println(uniCard.balance() + "\n");
        System.out.println("Enough money in the card? " + register.eatHeartily(uniCard));   
        System.out.println(uniCard.balance() + "\n");
        System.out.println("Enough money in the card? " + register.eatHeartily(uniCard));   
        System.out.println(uniCard.balance() + "\n");
        System.out.println("Enough money in the card? " + register.eatHeartily(uniCard));   
        System.out.println(uniCard.balance() + "\n");
        System.out.println("Enough money in the card? " + register.eatHeartily(uniCard));   
        System.out.println(uniCard.balance() + "\n");
        System.out.println("Enough money in the card? " + register.eatHeartily(uniCard));   
        System.out.println(uniCard.balance() + "\n");
        System.out.println("Enough money in the card? " + register.eatHeartily(uniCard));   
        System.out.println(uniCard.balance() + "\n");
        
        System.out.println("Adding money to the card");
        register.addMoneyToCard(uniCard, 5);
        System.out.println(uniCard.balance() + "\n");
        
        System.out.println("Buying heartly meal");
        register.eatHeartily(uniCard);
        System.out.println(uniCard.balance() + "\n");
        
        
        
//        change = register.eatHeartily(6);
//        System.out.println("Remaining change: " + change);
//        System.out.println(register + "\n");
        
    }
}

