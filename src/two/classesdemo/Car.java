package two.classesdemo;

public class Car {
    String brand;
    String color;
    int speed;

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    //    public Car(String brand,String color,int speed) {
//        this.brand = brand;
//        this.color = color;
//        this.speed = speed;
//
//    }

    public void drive(){
        System.out.println(brand+" is driving at "+speed);
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed =speed;
    }

}

//class abc {
//    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.speed = 100;
//        car1.brand = "Toyota";
//        car1.color = "White";
//        car1.drive();
//
//        Car car2 = new Car();
//        car2.speed = 140;
//        car2.brand = "Tesla";
//        car2.color = "Blue";
//        car2.drive();
//    }
//}