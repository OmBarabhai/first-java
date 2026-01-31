package Three.polymorphism;



class Calculator{
    public  int add(int a, int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }

}
public class polymorphismDemo {
    public static void main(String[] args) {
        Car car1 = new Car("BMW",5);
        car1.displayInfo();

        Calculator c1 = new Calculator();
        System.out.println("Sum(int): "+ c1.add(4,5));
        System.out.println("Sum(double): "+ c1.add(4.3,5.6));



        Vehicle v = new Vehicle("Vehicle");
        v.start();

        Vehicle v1 = new Car("Toyota",4);
        v1.start();

        Vehicle v2 = new Bike("Ninja",true);
        v2.start();
    }
}
