package two.classesdemo;

public class ClassesObjectDemo {
    public static void main(String[] args) {
      Car car1 = new Car("tesla","blue",160);
//
//      car1.speed = 100;
//      car1.brand = "Toyota";
//      car1.color = "Red";
      car1.drive();

      Car car2 = new Car("Toyota","white",120);
//
//      car2.speed = 140;
//      car2.brand = "Tesla";
//      car2.color = "Blue";
      car2.drive();

      System.out.println(car2.getSpeed());
      car2.setSpeed(500);
      System.out.println(car2.getSpeed());



    }
}