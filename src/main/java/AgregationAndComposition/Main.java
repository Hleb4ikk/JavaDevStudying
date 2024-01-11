package AgregationAndComposition;

public class Main {
    public static void main(String[] args){
        Freshener elka = new Freshener();
        Car Toyota = new Car(elka);
        Toyota.drive();
    }
}
