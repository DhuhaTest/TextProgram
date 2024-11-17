import java.util.Scanner;

public class TextInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your text in different lines, type 'Stop' to exit: ");


        int lines= 0;
        int chars= 0;

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                continue;
            }
            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Here is the result: ");
                break;
            }

            lines++;
            chars += input.length();
        }

        System.out.println("Number of lines (excluding 'stop'): " + lines);
        System.out.println("Number of characters (excluding 'stop'): " + chars);

        scanner.close();

    }
}
