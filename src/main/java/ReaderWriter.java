import java.util.Scanner;

public class ReaderWriter {
    Scanner scanner = new Scanner(System.in);

    public String read(){
        return scanner.next();
    }

    public void print(String message){
        System.out.print(message);
    }

    public void println(String message){
        System.out.println(message);
    }

    public void goToNextLine() {
        System.out.print("\n");
    }

}
