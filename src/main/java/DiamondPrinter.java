import java.util.Scanner;

public class DiamondPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DiamondGenerator diamondGenerator = new DiamondGenerator();

        while (true) {
            System.out.println("Enter the Highest Letter:");
            System.out.println(diamondGenerator.generate(scanner.next()));
        }
    }
}
