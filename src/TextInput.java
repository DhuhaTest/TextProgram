import java.util.Scanner;

public class TextInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextCounting count = new TextCounting();

        System.out.println("Enter your text in different lines, type 'Stop' to exit: ");


        while (true) {
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Here is the result: ");
                break;
            } else if (!input.trim().isEmpty()) {
                count.addLine(input);
            }
        }

        System.out.println("Number of lines: " + count.LinesCount());
        System.out.println("Number of characters, excluding spaces: " + count.CharsCountExcludingSpaces());
        System.out.println("Number of characters, including spaces: " + count.CharsCountIncludingSpaces());
        System.out.println("Number of words: " + count.wordCount());
        System.out.println("The longest word: " + count.longestWord());


        scanner.close();

    }
}
