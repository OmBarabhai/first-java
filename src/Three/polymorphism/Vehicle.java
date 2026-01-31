package Three.polymorphism;

public class Vehicle{
    protected String brand;

    public Vehicle(String brand){
        this.brand = brand;

    }
    public void start(){
        System.out.println("Starting Vehicle...");
    }

//    public abstract void start();

    public void displayInfo(){
        System.out.println("Car Brand: "+brand+",Doors");

    }

}