import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiamondBuilder {
    private List<String> letters = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
    private ReaderWriter readerWriter;

    public DiamondBuilder(ReaderWriter readerWriter) {
        this.readerWriter = readerWriter;
    }

    public void draw(String middleLetter) {
        int letterPosition = letters.indexOf(middleLetter);

        for (int count = 0; count <= letterPosition; count++) {
            printLetters(letterPosition, count);

        }
        for(int count = letterPosition - 1; count >= 0; count-- ){
            printLetters(letterPosition, count);
        }

    }

    private void printLetters(int letterPosition, int count) {
        int preSpaces = letterPosition - count;
        int middleSpaces = count;
        String letterToPrint = letters.get(count);

        print(" ", preSpaces);
        print(letterToPrint, 1);

        if (middleSpaces > 0) {
            print(" ", middleSpaces);
            print(letterToPrint, 1);
        }
    }

    private void print(String message, int times) {
        while (times > 0) {
            readerWriter.print(message);
            times--;
        }
    }
}