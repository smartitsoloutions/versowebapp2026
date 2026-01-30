import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Full Name: ");
        String name = scanner.nextLine();

        System.out.println("Hello World, " + name + "!");
        scanner.close();
    }
}
