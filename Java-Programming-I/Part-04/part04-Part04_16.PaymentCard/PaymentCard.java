/**
 *
 * @author bifronte
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }
    
    @Override
    public String toString(){
        return "The card has a balance of " +  this.balance + " euros";
    }
    
    public void eatAffordably(){
        if(this.balance >= 2.60){
            this.balance-= 2.60;
        }else{
            System.out.println("You don't have enough money\n " + this.toString());   
        }            
    }
    
    public void eatHeartily(){
        if(this.balance >= 4.60){
            this.balance-= 4.60;
        }else{
            System.out.println("You don't have enough money\n " + this.toString());   
        } 
    }
    
    public void addMoney(double amount){
        if(amount <= 0){
            return;
        }
        
        if( this.balance + amount > 150){
            this.balance = 150;
        }else{
            this.balance+= amount;
        }
        
    }
    
    public double getBalance(){
        return this.balance;
    }
}
