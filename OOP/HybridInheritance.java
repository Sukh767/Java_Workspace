interface Printable {
    void print();
}

class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal implements Printable {
    public void print() {
        System.out.println("Dog is printable");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
        d.print();
    }
}
