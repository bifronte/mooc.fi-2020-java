
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {        
//        int[] array = {3, 1, 5, 99, 3, 12};
//        String[] array2 = {"a","g","z","t","n"};
        
//        System.out.println("INITIAL STATE");
//        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(array2));
//        System.out.println("");
//        
//        System.out.println("Sorting int[]");
//        sort(array);
//        System.out.println(Arrays.toString(array));
//        
//        System.out.println("Sorting string[]");
//        sort(array2);
//        System.out.println(Arrays.toString(array2));
//        
        ArrayList<Integer> array3 = new ArrayList<>();
        array3.add(3);
        array3.add(10);
        array3.add(5);
        array3.add(-4);
        
        ArrayList<String> array4 = new ArrayList<>();
        array4.add("k");
        array4.add("q");
        array4.add("b");
        array4.add("w");
        
        System.out.println("INITIAL STATE");
        System.out.println(array3);
        System.out.println(array4);
        System.out.println("");
        
        System.out.println("Sorting ArrayList<Integer>");
        sortIntegers(array3);
        System.out.println(array3);
        
        System.out.println("Sorting ArrayList<String>");
        sortStrings(array4);
        System.out.println(array4);
        
    }

    public static void  sort(int[] array) {
        Arrays.sort(array);
    }
     
    public static void  sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void  sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void  sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
