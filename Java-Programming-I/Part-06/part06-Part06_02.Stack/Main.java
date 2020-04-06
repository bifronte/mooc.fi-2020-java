
public class Main {

    public static void main(String[] args) {

        Stack stackie = new Stack();
        
        System.out.println(stackie.isEmpty());
        
        stackie.add("1");
        stackie.add("2");
        stackie.add("3");
        stackie.add("4");
        stackie.add("5");
        
        while(!stackie.isEmpty()) {
            System.out.println(stackie.take());
        }
    }
}
