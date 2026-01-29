package two.classesdemo;

record Bike(String brand,int speed){}
public class RecordDemo {
    public static void main(String[] args) {
        Bike bike = new Bike("Honda",160);
        System.out.println("Brand: "+bike.brand());
        System.out.println("Speed: "+bike.speed());
        System.out.println(bike);

    }

}
