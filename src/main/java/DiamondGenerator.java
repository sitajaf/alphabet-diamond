import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiamondGenerator {
    private List<String> letters = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
    private final String SPACE = " ";
    private final String NEWLINE = "\n";
    private final String ERROR_MESSAGE = "Invalid Input!";


    private final int ZERO = 0;
    private final int ONE = 1;
    private final int TWO = 2;

    private String diamond = "";

    public String generate(String highestLetter) {
        diamond = "";
        if (highestLetter.matches("[a-zA-Z]")) {
            int letterPosition = letters.indexOf(highestLetter.toUpperCase());
            appendWhileExpanding(letterPosition);
            appendWhileNarrowing(letterPosition);
        } else {
            append(ERROR_MESSAGE);
        }
        return diamond;
    }

    private void appendWhileExpanding(int letterPosition) {
        for (int count = 0; count <= letterPosition; count++) {
            appendCharacters(letterPosition, count);
        }
    }

    private void appendWhileNarrowing(int letterPosition) {

        for (int count = letterPosition - ONE; count >= ZERO; count--) {
            appendCharacters(letterPosition, count);
        }
    }

    private void appendCharacters(int letterPosition, int count) {
        int noOfPreSpaces = letterPosition - count;
        int noOfMiddleSpaces = count > ZERO ? ((count - ONE) * TWO) + ONE : count;
        String letterToPrint = letters.get(count);


        appendTimes(SPACE, noOfPreSpaces);
        append(letterToPrint);

        if (noOfMiddleSpaces > ZERO) {
            appendTimes(SPACE, noOfMiddleSpaces);
            append(letterToPrint);
        }
        append(NEWLINE);
    }

    private void appendTimes(String letter, int times) {
        while (times > ZERO) {
            diamond = diamond.concat(letter);
            times--;
        }
    }

    private void append(String letter) {
        diamond = diamond.concat(letter);
    }

}
