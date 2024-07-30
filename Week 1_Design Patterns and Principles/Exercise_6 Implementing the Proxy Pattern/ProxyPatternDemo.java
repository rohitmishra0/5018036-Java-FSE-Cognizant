public class ProxyPatternDemo {
    public static void main(String[] args) {

        System.out.println();

        // Create the ProxyImage objects
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image is loaded and displayed
        image1.display();
        
        // Image is displayed without loading (cached)
        image1.display();

        // Image is loaded and displayed
        image2.display();
        
        // Image is displayed without loading (cached)
        image2.display();
    }
}
