interface Vehicle {
    void start();  // abstract method

    // ✅ Default method (Java 8 feature)
    default void fuel() {
        System.out.println("All vehicles need fuel ⛽");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started 🚗");
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.fuel();  // calling default method
    }
}
