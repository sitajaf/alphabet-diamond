import java.util.Scanner;

public class ReaderWriter {
    Scanner scanner;

    public ReaderWriter(Scanner scanner) {

        this.scanner = scanner;
    }

    public String read(String message){
        return scanner.next();
    }

    public void print(String message){
        System.out.print(message);
    }

}
