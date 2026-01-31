package Three.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota",200,5);
        c1.displayInfo();

        Bike b1 = new Bike("Ninja",300,true);
        b1.displayInfo();

    }
}
