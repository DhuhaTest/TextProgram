
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
    public void countChars() {

        TextCounting count = new TextCounting();

        count.addLine("This is the first line");
        count.addLine("This is the second line");
        count.addLine("Stop");
        count.addLine("STOP");
        count.addLine("stop");
        count.addLine("");
        count.addLine("  ");


        int expectedChars = 45;
        int actualChars = count.CharsCount();

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
    public void stopNotCounted() {

        TextCounting count = new TextCounting();

        count.addLine("This is the first line");
        count.addLine("This is the second line");
        count.addLine("Stop");
        count.addLine("STOP");
        count.addLine("stop");
        count.addLine("");
        count.addLine("  ");

        int expectedLines = 2;
        int expectedChars = 45;
        int actualLines = count.LinesCount();
        int actualChars = count.CharsCount();

        assertEquals(expectedLines,actualLines);
        assertEquals(expectedChars, actualChars);
    }
}


