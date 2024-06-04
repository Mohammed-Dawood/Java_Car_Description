package se.lexicon;

public class Car {

    // Fields
    String brand;
    String registration;
    int speed;
    String owner;

    // Methods
    public void displayCarDescription(){
        System.out.println("Brand: " + brand);
        System.out.println("Registration: " + registration);
        System.out.println("Speed: " + speed);
        System.out.println("Owner: " + owner);
    }
}
