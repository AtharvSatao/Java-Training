package DAY9.OOPS.Example2;

public class App {
    public static void main(String[] args) {

        LibraryManagement book1 = new LibraryManagement(
                101,
                "Java Programming",
                "James Gosling",
                "Programming",
                499.99,
                5
        );

        // Display Book Details
        System.out.println("=== Book Details ===");
        book1.Display();

        // Check Availability
        System.out.println("\nAvailable: " + book1.isAvailable());

        // Borrow Book
        System.out.println("\n=== Borrow Book ===");
        book1.Borrow();
        System.out.println("Available Copies: " + book1.getInventory());

        // Return Book
        System.out.println("\n=== Return Book ===");
        book1.returnBook();
        System.out.println("Available Copies: " + book1.getInventory());

        // Update Price
        System.out.println("\n=== Update Price ===");
        book1.UpdatePrice(599.99);
        System.out.println("Updated Price: " + book1.getPrice());

        // Display Updated Details
        System.out.println("\n=== Updated Book Details ===");
        book1.Display();
    }
}