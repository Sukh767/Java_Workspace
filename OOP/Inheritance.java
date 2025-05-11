class Fruit {
    String color = "Red";
    String name = "Apple";

    //Super class
    // public void fruitDetails() {
    //     System.out.println("Fruit name is: " + name);
    //     System.out.println("Fruit color is: " + color);
    // }
}

class Apple extends Fruit {
    String benefit = "Good for Heart";

    public void printDetails() {
        // Calling parent class properties
        System.out.println("Fruit name is: " + name);
        System.out.println("Fruit color is: " + color);
        System.out.println("Benefit is: " + benefit);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Apple obj = new Apple();
        obj.printDetails();
    }
}
