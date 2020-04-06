
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(1);
        list.add(8);
        list.add(11);
        list.add(24);
        list.add(6);
        
        System.out.println(sum(list));
    }
    
    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;
    }

}
