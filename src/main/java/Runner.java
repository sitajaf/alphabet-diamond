public class Runner {
    public static void main(String[]args){
        ReaderWriter readerWriter = new ReaderWriter();
        DiamondBuilder diamondBuilder = new DiamondBuilder();

        while(true){
            readerWriter.println("Enter the Highest Letter:");
            readerWriter.println(diamondBuilder.generate(readerWriter.read()));
        }
    }
}
