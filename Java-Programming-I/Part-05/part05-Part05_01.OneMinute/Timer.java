/**
 *
 * @author bifronte
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand hundreth;
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundreth = new ClockHand(100);
    }       
    
    public void advance(){
        this.hundreth.advance();
        
        if(hundreth.value() == 0){
            seconds.advance();
        }    
    }
    
    public String toString(){
        
        return this.seconds + ":" + this.hundreth;        
    }
}
