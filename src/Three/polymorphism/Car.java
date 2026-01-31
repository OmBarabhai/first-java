package Three.polymorphism;


public class Car extends Vehicle{
    private final int doors;

    public Car(String brand,int doors){
        super(brand);
        this.doors =doors;

    }
    @Override
    public void start(){
        System.out.println("Starting a Car....");
    }
    @Override
    public void displayInfo(){
        System.out.println("Car Brand: "+brand+",Doors: "+doors);

    }
}