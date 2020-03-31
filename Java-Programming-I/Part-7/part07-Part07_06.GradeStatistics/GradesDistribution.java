/**
 *
 * @author bifronte
 */

//Transform points into grades

public class GradesDistribution {
    private int[] array;  
    
    public GradesDistribution() {
        array = new int[]{0,0,0,0,0,0};
    }
    
    public void add(int points) {
       if(points >= 90) {
            array[5]++;
            
        }else if(points >= 80) {
            array[4]++;
            
        }else if(points >= 70) {
            array[3]++;
            
        }else if(points >= 60) {
            array[2]++;
            
        }else if(points >= 50) {
            array[1]++;
            
        }else{
            array[0]++;
        }
    }  
    
    public void printGradeDistribution() {
        for(int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(array[i]);
            System.out.println("");
        }
    }
    
    private void printStars(int times) {
        int i = times;
        while(i > 0) {
            System.out.print("*");
            i--;
        }        
    }
}
    
    
   
       

