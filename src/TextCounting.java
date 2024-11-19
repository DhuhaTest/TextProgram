public class TextCounting {

    private int lines= 0;
    private int chars= 0;


    public void addLine(String line) {

        if (line != null && !line.trim().equalsIgnoreCase("stop") &&!line.trim().isEmpty())  {
            lines++;
            chars += line.length();
        }
    }

    public int LinesCount() {

        return lines;
    }

    public int CharsCount() {
        return chars;
    }
}
