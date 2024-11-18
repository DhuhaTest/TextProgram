public class TextCounting {

    private int lines= 0;
    private int chars= 0;


    public void addLine(String line) {
        lines++;
        chars += line.length();
    }

    public int LinesCount() {
        return lines;
    }

    public int CharsCount() {
        return chars;
    }
}
