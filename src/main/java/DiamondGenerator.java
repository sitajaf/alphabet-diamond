import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiamondGenerator {
    private List<String> letters = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
    String diamond = "";
    String newLine = "\n";


    public String generate(String highestLetter) {
        diamond = "";
        if (highestLetter.matches("[a-zA-Z]")) {
            int letterPosition = letters.indexOf(highestLetter.toUpperCase());
            appendWhileExpanding(letterPosition);
            appendWhileNarrowing(letterPosition);
        } else {
            append("Invalid Input!");
        }
        return diamond;
    }

    private void appendWhileExpanding(int letterPosition) {
        for (int count = 0; count <= letterPosition; count++) {
            appendCharacters(letterPosition, count);
        }
    }

    private void appendWhileNarrowing(int letterPosition) {
        for (int count = letterPosition - 1; count >= 0; count--) {
            appendCharacters(letterPosition, count);
        }
    }

    private void appendCharacters(int letterPosition, int count) {
        int noOfPreSpaces = letterPosition - count;
        int noOfMiddleSpaces = count > 0 ? ((count - 1) * 2) + 1 : count;
        String letterToPrint = letters.get(count);

        appendTimes(" ", noOfPreSpaces);
        append(letterToPrint);

        if (noOfMiddleSpaces > 0) {
            appendTimes(" ", noOfMiddleSpaces);
            append(letterToPrint);
        }
        append(newLine);
    }

    private void appendTimes(String letter, int times) {
        while (times > 0) {
            diamond = diamond.concat(letter);
            times--;
        }
    }

    private void append(String letter) {
        diamond = diamond.concat(letter);
    }


}
