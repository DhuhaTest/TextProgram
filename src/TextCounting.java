public class TextCounting {

    private int lines = 0;
    private int charExcludingSpaces = 0;
    private int charIncludingSpaces = 0;
    private int wordsC = 0;
    private String longestWord = "";


    public void addLine(String line) {

        if (line != null && !line.trim().equalsIgnoreCase("stop") && !line.trim().isEmpty()) {

            lines++;
            charExcludingSpaces += line.replaceAll("\\s", "").length();
            charIncludingSpaces += line.length();
            String[] words = line.split("\\s+");
            wordsC += words.length;


            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
    }

    public int LinesCount() {
        return lines;
    }

    public int CharsCountExcludingSpaces() {
        return charExcludingSpaces;
    }

    public int CharsCountIncludingSpaces() {
        return charIncludingSpaces;
    }


    public int wordCount() {
        return wordsC;
    }

    public String longestWord() {
        return longestWord;
    }

}
