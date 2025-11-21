class Vehicle {
    void speed() {
        System.out.println("Vehicle speed unknown.");
    }
}

class Car extends Vehicle {
    @Override
    void speed() {
        System.out.println("Car speed: 150 km/h");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void speed() {
        System.out.println("Motorcycle speed: 120 km/h");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();

        v1.speed(); // Car version
        v2.speed(); // Motorcycle version
    }
}
