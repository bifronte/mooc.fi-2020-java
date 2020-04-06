/**
 *
 * @author bifronte
 */

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        history = new ArrayList<>();
    }
    
    public void add(double status) {
        history.add(status);
    }
    
    public void clear() {
        history.clear();
    }       
    
    public double maxValue() {    
        if(history.isEmpty()) {
            return 0;
        }
        
        double greatestValue = history.get(0);
        for(double value: history) {
            if(value > greatestValue) {
                greatestValue = value;
            }
        }
        
        return greatestValue;
    }
    
    public double minValue() {
        if(history.isEmpty()) {
            return 0;
        }
        
        double smallesValue = history.get(0);
        for(double value: history) {
            if(value < smallesValue) {
                smallesValue = value;
            }        
        }
        
        return smallesValue;
    }
    
    public double average() {
        if(history.isEmpty()) {
            return 0;
        }
        
        double sum = 0;
        for(double value: history) {
            sum += value;
        }
        
        return sum / history.size();
    }
    
    @Override
    public String toString() {
        return history.toString();
    }
}
