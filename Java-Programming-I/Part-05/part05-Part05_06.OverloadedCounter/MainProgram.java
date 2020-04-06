
public class MainProgram {

    public static void main(String[] args) {
        Counter cnt = new Counter();
        cnt.increase();
        cnt.increase();
        System.out.println(cnt.value());
        cnt.decrease();
        System.out.println(cnt.value());
        System.out.println("");
        
        Counter knt = new Counter(25);
        knt.decrease(5);
        knt.decrease(5);
        System.out.println(knt.value());
        knt.increase(7);
        System.out.println(knt.value());
    }
}
