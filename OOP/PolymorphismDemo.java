// POLYMORPHISM in Java
// ---------------------------------
// Meaning: "Many forms"
// In Java, Polymorphism is mainly of 2 types:
// 1) Compile-time (Static Polymorphism) ➔ Method Overloading
// 2) Runtime (Dynamic Polymorphism) ➔ Method Overriding

// -----------------------------
// 1) Compile-time Polymorphism (Method Overloading)
// -----------------------------
// ➔ Same method name, but different parameter list (type or count)
// ➔ Decided at compile time (which method to call)
class Calculator {

    // Method 1: adds two int
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: adds three int
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: adds two double
    double add(double a, double b) {
        return a + b;
    }
}

// -----------------------------
// ✅ 2) Runtime Polymorphism (Method Overriding)
// -----------------------------
// ➔ Subclass provides specific implementation of parent class method
// ➔ Resolved at runtime using dynamic method dispatch

// Parent Class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class 1
class Dog extends Animal {
    void sound() {
        System.out.println("Dog says: Woof Woof 🐶");
    }
}

// Child Class 2
class Cat extends Animal {
    void sound() {
        System.out.println("Cat says: Meow Meow 🐱");
    }
}

// -----------------------------
// ✅ Main Class
// -----------------------------
public class PolymorphismDemo {
    public static void main(String[] args) {
        
        // ✅ 1) Compile-time Polymorphism Example
        System.out.println("✅ Compile-time Polymorphism:");
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 int: " + calc.add(5, 10));        // calls 2 int method
        System.out.println("Sum of 3 int: " + calc.add(1, 2, 3));      // calls 3 int method
        System.out.println("Sum of 2 double: " + calc.add(2.5, 3.5));  // calls 2 double method

        System.out.println("\n✅ Runtime Polymorphism:");

        // ✅ 2) Runtime Polymorphism Example
        Animal myAnimal; // reference of parent type

        myAnimal = new Dog();  // Dog object
        myAnimal.sound();      // calls Dog's sound()

        myAnimal = new Cat();  // Cat object
        myAnimal.sound();      // calls Cat's sound()

        // ✅ Dynamic Method Dispatch ➔ The object type decides which method gets called at runtime
    }
}
