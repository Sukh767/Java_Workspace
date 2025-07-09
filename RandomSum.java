import java.lang.Math;

public class RandomSum {
    public static void main(String[] args) {
        System.out.println("This program adds only positive numbers until the total reaches 2345:");

        int total = 0, random;

        while (total <= 2345) {
            random = (int)(Math.random() * 90); // Generates a number between 0 and 89

            // Check if adding the random number keeps total within limit
            if (total + random <= 2345) {
                total += random;
                System.out.println("Random number is: " + random);
                System.out.println("Sum of random numbers is: " + total);
            } else {
                break;
            }
        }

        System.out.println("TOTAL: " + total);
    }
}
