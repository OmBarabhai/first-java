package Three.polymorphism;

public class Bike extends Vehicle {
    private final boolean hasCareer;

    public Bike(String brand, boolean hasCareer){
        super(brand);
        this.hasCareer = hasCareer;
    }
    @Override
    public void start(){
        System.out.println("Starting a Bike....");
    }
    @Override
    public void displayInfo(){
        System.out.println("Bike brand is: "+brand+"has a Career"+hasCareer);
    }

}
