package activities;

public class Car {
    String color;
    int make;
    String transmission;
    int tyres;
    int doors;
    Car() {
        tyres = 4;
        doors = 4;
    }
    public void displayCharacterstics(){
        System.out.println("Color of Car: " + color);
        System.out.println("Make of Car: " + make);
        System.out.println("Transmission of Car: " + transmission);
        System.out.println("Number of doors in the car: " + doors);
        System.out.println("Number of tyres in the car: " + tyres);
    }

    public void accelerate() {
        System.out.println("Car is moving forward.");
    }

    public void brake() {
        System.out.println("Car has stopped.");
    }
}
