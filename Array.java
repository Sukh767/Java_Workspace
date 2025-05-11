import java.util.Scanner;

class Array1 {
    int[] arr = new int[5];
    Scanner inp = new Scanner(System.in);

    public void inputArray() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the " + (i + 1) + " element: ");
            arr[i] = inp.nextInt();
        }
    }

    public void displayArray() {
        System.out.println("The array elements are:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public class Array {
    public static void main(String[] args) {
        Array1 a1 = new Array1();  // Create object
        a1.inputArray();          // Call input method
        a1.displayArray();        // Call display method
    }
}
