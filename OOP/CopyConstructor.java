class Midea {
    int a;
    String ac = "Midea Ac";

    // Copy Constructor
    Midea(Midea ref) {
        this.a = ref.a;
        this.ac = ref.ac;
    }

    // Normal constructor
    Midea(int a, String ac) {
        this.a = a;
        this.ac = ac;
    }

    void display() {
        System.out.println("AC Name: " + ac + ", a = " + a);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Midea obj1 = new Midea(5, "Midea SuperCool");
        obj1.display();

        // Copying obj1 into obj2
        Midea obj2 = new Midea(obj1);
        obj2.display();

        // Now, let's change obj2 to prove they are separate
        obj2.a = 10;
        obj2.ac = "Midea Turbo";

        System.out.println("\nAfter modifying obj2:");
        obj1.display(); // original stays same
        obj2.display(); // modified
    }
}
