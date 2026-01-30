import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Full Name & Roll Number: ");
        String name = scanner.nextLine();

        System.out.println("Hello World, " + name of the student + "!");
        scanner.close();
    }
}
