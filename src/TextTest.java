import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class TextTest {

    @Test
    public void countLines() {

        TextCounting count = new TextCounting();

        count.addLine("This is the first line");
        count.addLine("This is the second line");
        count.addLine("Stop");
        count.addLine("STOP");
        count.addLine("stop");
        count.addLine("");
        count.addLine("  ");

        int expectedLines = 2;
        int actualLines = count.LinesCount();

        assertEquals(expectedLines, actualLines);
    }

    @Test
    public void countCharsExcludingSpaces() {

        TextCounting count = new TextCounting();

        count.addLine("This is the first line");
        count.addLine("This is the second line");
        count.addLine("Stop");
        count.addLine("STOP");
        count.addLine("stop");
        count.addLine("");
        count.addLine("  ");


        int expectedChars = 37;
        int actualChars = count.CharsCountExcludingSpaces();

        assertEquals(expectedChars, actualChars);

    }

    @Test
    public void countCharsIncludingSpaces() {

        TextCounting count = new TextCounting();

        count.addLine("This is the first line");
        count.addLine("This is the second line");
        count.addLine("Stop");
        count.addLine("STOP");
        count.addLine("stop");
        count.addLine("");
        count.addLine("  ");


        int expectedChars = 45;
        int actualChars = count.CharsCountIncludingSpaces();

        assertEquals(expectedChars, actualChars);

    }

    @Test
    public void ignoreEmptyLines() {

        TextCounting count = new TextCounting();

        count.addLine("This is the first line");
        count.addLine("This is the second line");
        count.addLine("This is the third line");
        count.addLine("Stop");
        count.addLine("STOP");
        count.addLine("stop");
        count.addLine("");
        count.addLine("  ");

        int expectedLines = 3;
        int actualLines = count.LinesCount();

        assertEquals(expectedLines, actualLines);
    }


    @Test
    public void wordsCount() {

        TextCounting count = new TextCounting();

        count.addLine("This is the first line");
        count.addLine("This is the second line");
        count.addLine("Stop");
        count.addLine("STOP");
        count.addLine("stop");
        count.addLine("");
        count.addLine("  ");


        assertEquals(10, count.wordCount());

    }

    @Test
    public void longestWord() {

        TextCounting count = new TextCounting();

        count.addLine("This is the first line");
        count.addLine("This is the second line");
        count.addLine("ThisIsTheLongestWord");
        count.addLine("Stop");
        count.addLine("STOP");
        count.addLine("stop");
        count.addLine("");
        count.addLine("  ");


        assertEquals("ThisIsTheLongestWord", count.longestWord());

    }

    @Test
    public void stopNotCounted() {

        TextCounting count = new TextCounting();

        count.addLine("This is the first line");
        count.addLine("This is the second line");
        count.addLine("Stop");
        count.addLine("STOP");
        count.addLine("stop");
        count.addLine("");
        count.addLine("  ");


        assertEquals(2, count.LinesCount());
        assertEquals(37, count.CharsCountExcludingSpaces());
        assertEquals(45, count.CharsCountIncludingSpaces());
        assertEquals(10, count.wordCount());
        assertEquals("second", count.longestWord());
    }
}


