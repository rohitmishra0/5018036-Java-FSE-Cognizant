// WordDocument.java
public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening the Word document.");
    }

    @Override
    public void close() {
        System.out.println("Closing the Word document.");
    }
}



