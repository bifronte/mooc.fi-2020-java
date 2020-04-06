/**
 *
 * @author bifronte
 */

import java.util.ArrayList;

public class PointManager {
    private ArrayList<Integer> pointsList;
    private ArrayList<Integer> pointsPassingGrade;
    
    public PointManager() {
        this.pointsList = new ArrayList<>();
        this.pointsPassingGrade = new ArrayList<>();
    }
    
    // CORE METHODS
    public void add(int points) {
        this.pointsList.add(points);
    }
    
    public void addPassingGrades(int points) {
        this.pointsPassingGrade.add(points);
    }
    
    public int getSum(ArrayList<Integer> array) {
        int sum = 0;
        for(int points: array) {
            sum += points;
        }
        
        return sum;
    }
    
    // GETTERS
    public double getGlobalAverage() {
        int count = this.pointsList.size();
        int sum = getSum(pointsList);
        
        return 1.0 * sum / count;
    }
    
    public double getPassingAverage() {            
        if(pointsPassingGrade.isEmpty()) {
            return -1;
        }
        
        int sum = getSum(pointsPassingGrade);
        int count = pointsPassingGrade.size();            
        
        return 1.0 * sum/count;
    }
    
    public double getPassPercentage() {
        double passPercentage = 1.0* (100 * this.pointsPassingGrade.size()) / this.pointsList.size(); 
        return passPercentage;
    }    
    
    
    // PRINT METHODS
    public void printGlobalAverage() {
        System.out.println("Point average (all): " + getGlobalAverage());
    }
    
    public void printPassingAverage() {
        if(getPassingAverage() < 0) {
            System.out.println("Point average (passing): -");
        }else {
            System.out.println("Point average (passing): " + 1.0* getPassingAverage());
        }
    }
    
    public void printPassPercentage() {
        System.out.println("Pass percentage: " + getPassPercentage());
    }
 }
