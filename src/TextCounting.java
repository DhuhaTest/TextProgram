public class TextCounting {

    private int lines = 0;
    private int chars = 0;
    private int wordsC = 0;
    private String longestWord = "";


    public void addLine(String line) {

        if (line != null && !line.trim().equalsIgnoreCase("stop") && !line.trim().isEmpty()) {

            lines++;
            chars += line.length();
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

    public int CharsCount() {
        return chars;
    }

    public int wordCount() {
        return wordsC;
    }

    public String longestWord() {
        return longestWord;
    }

}
