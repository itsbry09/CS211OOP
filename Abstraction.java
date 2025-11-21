abstract class Vehicle {
    abstract void speed();
}

class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car runs at 150 km/h");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.speed();
    }
}
