import java.util.Scanner;

public class TextInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your text in different lines, type 'Stop' to exit: ");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Program stopped.");
                break;
            }

        }
        scanner.close();

    }
}
