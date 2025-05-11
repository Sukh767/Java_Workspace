interface Printable {
    void print();
}

interface Showable {
    void show();
}

class A implements Printable, Showable {
    public void print() {
        System.out.println("Hello print");
    }

    public void show() {
        System.out.println("Hello show");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
        obj.show();
    }
}
