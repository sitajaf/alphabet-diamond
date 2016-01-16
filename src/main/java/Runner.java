public class Runner {
    public static void main(String[]args){
        ReaderWriter readerWriter = new ReaderWriter();
        DiamondBuilder diamondBuilder = new DiamondBuilder(readerWriter);

        while(true){
            readerWriter.println("Enter the Maximum Letter:");
            diamondBuilder.draw(readerWriter.read());
        }
    }
}
