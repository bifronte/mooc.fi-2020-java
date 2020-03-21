
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);
        
        System.out.println("Is ManhattanStudioApt larger than atlantaTwoBedroomApt?? " + manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
        
        System.out.println("Price difference between atlantaTwoBedroomApt and bangorThreeBedroomApt:");
        System.out.println(atlantaTwoBedroomApt.priceDifference(bangorThreeBedroomApt));
        
        System.out.println("Is manhattanStudioApt more expensive than bangorThreeBedroomApt?? " + manhattanStudioApt.moreExpensiveThan(bangorThreeBedroomApt));
  
    }
}
