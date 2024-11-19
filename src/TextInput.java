import java.util.Scanner;

public class TextInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        TextCounting count = new TextCounting();

        System.out.println("Enter your text in different lines, type 'Stop' to exit: ");


        while (true) {
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Here is the result: ");
                break;
            }
            if (!input.trim().isEmpty()) {
                count.addLine(input);
            }


        }

        System.out.println("Number of lines, excluding 'stop': " + count.LinesCount());
        System.out.println("Number of characters, excluding 'stop': " + count.CharsCount());

        scanner.close();

    }
}
