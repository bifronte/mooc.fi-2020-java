
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {6, 3, 0, -1, 4};
        System.out.println("Initial state");
        System.out.println(Arrays.toString(numbers));
        System.out.println("");
//        sort(numbers);
        System.out.println(indexOfSmallest(numbers));
    }  
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for(int number: array) {
           if(smallest > number) { 
               smallest = number;
           }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
                
        for(int i = 0; i < array.length; i++) {
           if(smallest > array[i]) {
               smallest = array[i];
               index = i;    
           }
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int index = 0;        
                
        for(int i = startIndex; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        
        if(index == 0) {
            index = startIndex;
        }
        
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        
    }
    
    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int indexOfSmallest = indexOfSmallestFrom(array, i);
            
            swap(array, i, indexOfSmallest);        
            System.out.println(Arrays.toString(array));
        }
    }
}
