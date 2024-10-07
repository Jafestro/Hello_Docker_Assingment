
import java.util.Scanner;

public class JafarDocker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // Display the user's name
        System.out.println("Hello, " + name + "! Your name is Dockerized!");
    }
}
