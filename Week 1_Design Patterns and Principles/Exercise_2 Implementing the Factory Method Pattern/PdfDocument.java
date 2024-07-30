// PdfDocument.java
public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening the PDF document.");
    }

    @Override
    public void close() {
        System.out.println("Closing the PDF document.");
    }
}