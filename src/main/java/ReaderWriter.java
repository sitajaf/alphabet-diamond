import java.util.Scanner;

public class ReaderWriter {
    Scanner scanner = new Scanner(System.in);

    public String read(){
        return scanner.next();
    }

    public void println(String message){
        System.out.println(message);
    }

}
