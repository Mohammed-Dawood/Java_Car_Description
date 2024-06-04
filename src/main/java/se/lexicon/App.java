package se.lexicon;


public class App {

    public static void main(String[] args) {
        // car1
        Car car1 = new Car();
        car1.brand = "Volvo XC40";
        car1.registration = "ABC";
        car1.speed = 220;
        car1.owner = "Daniel";
        car1.displayCarDescription();

        // car2
        Car car2 = new Car();
        car2.brand = "BMW";
        car2.registration = "DEF";
        car2.speed = 250;
        car2.owner = "David";
        car2.displayCarDescription();

    }
}
